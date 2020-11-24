import java.util.*;



// Класс Phone
class Phone {
    String number;
    String model;
    String weight;
    int i = 0;
    Phone() /*конструкток без параметров */ {
    }
    static void out_date(String number, String model, String weight) {
        System.out.println("Данные телефона:");
        System.out.println("-----------------");
        out_date2(number, model); // Вызов конатруктора с двумя параметрами из другого класса
        System.out.println("Вес телефона: " + weight);
    }

    static void out_date2(String number, String model) {
        System.out.println("Данные телефона:");
        System.out.println("-----------------");
        System.out.println("Номер телефона: " + number);
        System.out.println("Модель телефона: " + model);
    }

    static void receive_call(String number) { //Конструктор с именем звонящего
        System.out.println();
        System.out.println("Вам звонит: " + number);
    }

    static void receive_call(String number, String name) {
        System.out.println();
        System.out.println("Вам звонит: " + number + " " + name);
    }

    void SendMessage(String...input) {
            String [] inv = input;
            for (i = 0; i < inv.length; i++) {
                System.out.println("Номер телефона: " + inv[i]);
        }
    }
}
//_________________________________________________________________________________

// Класс Animal
class Animal {
  protected String food;
  protected String location;

void out_name() {
    System.out.println("Нет имени");
}


 void makeNoise() {
     System.out.println("-------------------");
    }

  void sleep() {
     System.out.println("-------------");
    }

 void eat() {
     System.out.println("-----------");
 }

}

class Dog extends Animal {
    public Dog() {
        food = "Кости";
        location = "Тверь";
    }
  void out_name() {
        System.out.println("Собаку зовут Тузик");

    }


    void makeNoise() {
        System.out.println("Животное не нуждается в медицинской помощи");
    }

    void sleep() {
        System.out.println("Животное не хочет спать");
    }

    void eat() {
        System.out.println("Животное не голодное");
    }
}


class Cat extends Animal {
    public Cat() {
        food = "Кошачий корм";
        location = "Москва";
    }

    void out_name() {
        System.out.println("Кошку зовут Мурка");

    }

    void makeNoise() {
        System.out.println("Животное не нуждается в медицинской помощи");
    }

    void sleep() {
        System.out.println("Животное хочет спать");
    }


    void eat() {
        System.out.println("Животное не голодное");
    }
}

class Horse extends Animal {
    public Horse() {
        food = "Сено";
        location = "Деревня";
    }

    void out_name() {
        System.out.println("Лошадь зовут Зорька");
    }

    void makeNoise() {
        System.out.println("Животное нуждается в медицинской помощи");
    }

    void sleep() {
        System.out.println("Животное не хочет спать");
    }

    void eat() {
        System.out.println("Животное устало и голодно");
    }
}

class veterinar{
    void threatAnimal(Animal animal) {
        System.out.println("food данного животного:" + animal.food);
        System.out.println("location данного животного: " + animal.location);
    }
}

//-----------------------------------------------------------------------------------------

class Student {
    protected String FirstName = "Иван";
    protected String LastName = "Антонов";
    protected String group = "12D";
    protected double averageMark = 4.6;

    void who() {
        System.out.println("Студент");
        System.out.println();
    }


    double getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {return 80;}
    }
}

class Aspirant extends Student {
    String work = "Научная работа на тему: Микросхемы";

    void who() {
        System.out.println("Аспирант");
        System.out.println();
    }

    public Aspirant() {
        averageMark = 5.0;
    }

    double getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}


//------------------------------------------------
public class HomeProject3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите название класса (для выхода введите exit) : ");
        String set = scan.nextLine();
        switch (set) {
            case "Phone":
                Phone telephone1 = new Phone();
                Phone telephone2 = new Phone();
                Phone telephone3 = new Phone();
                telephone1.out_date("891056693", "Nokia", "120 г.");
                telephone2.out_date("89045669122", "Samsung", "190 г.");
                telephone3.out_date("89013905499", "IPhone", "156 г.");

                telephone1.receive_call("89140034590", "Иван");
                telephone1.receive_call("89037775490", "Татьяна");
                telephone3.receive_call("89056779021", "Виктор");

                System.out.println("Номера телефонов, которым будет отправлено сообщение: ");

                telephone1.SendMessage("890128644", "89013458864", "843200035", "8566007777", "89105431200", "89156667021");
                break;
//----------------------------------------------------------------------------------------------------------------------------------------------

            case "Animal":
                    veterinar doc = new veterinar();
                    Dog dog = new Dog();
                    Cat cat = new Cat();
                    Horse horse = new Horse();
                    Animal [] massive = {dog, cat, horse};

                    for (int i = 0; i < massive.length; i++) {
                        System.out.println();
                        massive[i].out_name();
                        doc.threatAnimal(massive[i]);
                        massive[i].makeNoise();
                        massive[i].sleep();
                        massive[i].eat();
                    }
                break;
 //-----------------------------------------------------------------------------
            case "Student":
                Student stud  = new Aspirant();
                Student stud1 = new Student();
                Aspirant asp = new Aspirant();
                Student [] std = {stud1, asp};

                for (int i = 0; i < std.length; i++) {
                    double stipendia = std[i].getScholarship();
                    std[i].who();
                    System.out.println("Стипендия составляет: " + stipendia);
                }
        }
    }
}
