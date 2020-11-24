import java.util.Collection;
import java.util.Scanner;
class qst1 {
    qst1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        String input = scan.nextLine();
        char[] massive = input.toCharArray();
        int i = massive.length - 1;
        System.out.println("Последняя цифра введённого числа: " + massive[i]);
    }
}

class qst2 {
    qst2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое трёхзначное число: ");
        String input = scan.nextLine();
        char [] massive = input.toCharArray();
        int out = 0;
        for (int i = 0; i < 3; i++) {
            out += Character.getNumericValue(massive[i]);
        }

        System.out.println("Сумма равна: " + out);
    }
}

class qst3 {
    qst3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String input = scan.nextLine();
        int i = Integer.parseInt(input);

        if(i > 0) {
            i = i +1;
            System.out.println("Результат: " + i);
        } else {
            System.out.println("Результат: " + i);
        }
    }
}

class qst4 {
    qst4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        String input = scan.nextLine();
        int i = Integer.parseInt(input);

        if (i > 0) {
            i = i +1;
            System.out.println("Ответ: " + i);
        } else if (i < 0) {
            i = i - 2;
            System.out.println("Ответ: " + i);
        } else {
            i = 10;
            System.out.println("Ответ: " + i);
        }
    }
}


class qst5 {
    qst5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ведите первое число: ");
        String input = scan.nextLine();
        int i = Integer.parseInt(input);
        System.out.print("Ведите второе число: ");
        input = scan.nextLine();
        int y = Integer.parseInt(input);
        System.out.print("Ведите второе число: ");
        input = scan.nextLine();
        int out = i;
        int z = Integer.parseInt(input);
        if (out > y ) {out = y;}
        if (out > z ) {out = z;}

        System.out.println("Наименьшее число: " + out);
    }

}

class qst6 {
    qst6() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        String input = scan.nextLine();
        int num = Integer.valueOf(input);

        if (num > 0 && num%2==0) {
           System.out.println("Положительное чётное число: " + num);

        }
        if (num < 0 && num%2==0) {
            System.out.println("Отричательное чётное число: " + num);
        }
        if (num > 0 && num%2 > 0) {
            System.out.println("Положительное не чётное число: " + num);
        }
        if (num < 0 && num%2 < 0) {
            System.out.println("Отрицательное не чётное число: " + num);
        }
    }
}

class qst7 {
    qst7() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите код города: ");
        String input = scan.nextLine();
        double i = 0;
        switch (input) {
            case "905": i = 10 * 4.15; System.out.println("Краснодар. Стоимость разговора: " + i); break;
            case "194": i = 10 * 1.98; System.out.println("Ростов. Стоимость разговора: " + i); break;
            case "491": i = 10 * 2.69; System.out.println("Краснодар. Стоимость разговора: " + i); break;
            case "800": i = 10 * 5.00; System.out.println("Киров. Стоимость разговора: " + i); break;
            default: System.out.println("Вы ввели не верный код города!"); break;
        }
    }
}

class qst8 {
    qst8() {
        double [] massive = {1,-10,5,6,45,23,-45,-34,0,32,56,-1.2,-2};
        double max_value = 0;

        for (int i = 0; i < massive.length; i++) {
            if (max_value < massive[i]) {
                max_value = massive[i];
            }
        }

        double plus_element = 0;
        int plus_elements = 0;
        double out_minus_elements = massive[1] + massive[7] + massive[12];
        double sr_out_minus_elements = out_minus_elements / 3;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > 0) {
                plus_element += massive[i];
                plus_elements += 1;
            }

        }
        System.out.println("Решение: ");
        System.out.println("Максимальное значение:" + max_value);
        System.out.println("Сумма положительных элементов:" + plus_element);
        System.out.println("Количество положительных элементов: " + plus_elements);
        System.out.println("Сумма целых отрицательных элементов: " + out_minus_elements);
        System.out.println("Среднее арифметическое отричательных элементов: " + sr_out_minus_elements);
    }

}

class qst9 {
    qst9() {
        int [] massive = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int n = massive.length;
        int tmp = 0;

        for(int i = 0; i < n/2; i++) {
           tmp = massive[n -i -1];
           massive[n -i -1] = massive[i];
           massive[i] = tmp;
         }

            System.out.println("Массив в обратном порядке: ");
        for (int i = 0; i< massive.length; i++) {
            System.out.println(massive[i]);
        }
    }
}

class qst10 {
    qst10() {
        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int [] arrNew = new int [arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrNew[index] += arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arrNew[index] += arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arrNew[index] += arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arrNew[i]);
        }
    }
}

        public class Main {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int x = 1;
                while (x == 1) {
                    System.out.print("Введите номер задачи(для выхода введите exit): ");
                    String input = scan.nextLine();

                    switch (input) {
                        case "1":
                            new qst1();
                            break;
                        case "2":
                            new qst2();
                            break;
                        case "3":
                            new qst3();
                            break;
                        case "4":
                            new qst4();
                            break;
                        case "5":
                            new qst5();
                            break;
                        case "6":
                            new qst6();
                            break;
                        case "7":
                            new qst7();
                            break;
                        case "8":
                            new qst8();
                            break;
                        case "9":
                            new qst9();
                            break;
                        case "10":
                            new qst10();
                            break;
                        case "exit":
                            System.out.println("До свидания!");
                            x = 0;
                            break;
                        default:
                            break;
                    }

                }
            }
        }
