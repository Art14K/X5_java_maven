import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        String[] Input = new String[5]; // Массив для преобразования строки
        int lenght_db; // Содержит длину массива





        CreateDb createDb = new CreateDb("base.txt");
        createDb.createDb();
        lenght_db = createDb.lenghtDb();
        String[] base = new String[lenght_db];
        base = createDb.readDb(lenght_db);


        List<Account> listBase = new ArrayList<Account>(); //Создаём коллекцию для хранения данных
        for (int i = 0; i < lenght_db; i++) {
            input = base[i]; // Преобразовываем элемент массива в строку
            String[] sub_str = input.split(":"); // Разбиваем строку по разделителю
            listBase.add(new Account(i, sub_str[0], Double.parseDouble(sub_str[1]))); // Добавляем элементы в коллекцию
        }


        UserOperation userOperation = new UserOperation(listBase, createDb, lenght_db); // Создаём класс для выполнения пользовательских операций
        while (Input[0] != "exit") {
            try {
                System.out.print("Введите команду(для выхода из программы введите exit: ");
                input = scan.nextLine();
                Input = input.split(" ");
                switch (Input[0]) {
                    case "exit":
                        Input[0] = "exit"; // при выходе из программы "кидает" исключение ArrayIndexOutOfBoundsException. Не смог разобраться почему
                    case "test":
                        break;

                    case "balance":
                        try {
                            userOperation.balance(Integer.parseInt(Input[1]));
                        } catch (UnknownAccountException exc) {
                            System.out.println("Такого аккаунта не существует!");
                        }
                        break;

                    case "withdraw":
                        try {
                            Input[2] = Input[2].replaceAll(",", ".");
                            userOperation.withdraw(Integer.parseInt(Input[1]), Double.parseDouble(Input[2]));
                        } catch (UnknownAccountException exc) {
                            System.out.println("Такого аккаунта не существует!");
                        } catch (NotEnoughMoneyException exc) {
                            System.out.println("На указанном счёте не достаточно средств");
                        }

                        break;


                    case "deposit":
                        try {
                            Input[2] = Input[2].replaceAll(",", ".");
                            userOperation.deposit(Integer.parseInt(Input[1]), Double.parseDouble(Input[2]));
                        } catch (UnknownAccountException exc) {
                            System.out.println("Такого аккаунта не существует!");
                        }


                    case "transfer":
                        try {
                            Input[3] = Input[3].replaceAll(",", ".");
                            userOperation.transfer(Integer.parseInt(Input[1]), Integer.parseInt(Input[2]), Double.parseDouble(Input[3]));
                        } catch (UnknownAccountException exc) {
                            System.out.println("На указанном счёте не достаточно средств");
                        } catch (NotEnoughMoneyException exc) {
                            System.out.println("На указанном счёте не достаточно средств");
                        }

                    default:
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException exc) {
            }
        }
        createDb.updateDb(listBase);
    }
}
