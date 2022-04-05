package org.lessons2class;

/*Создайте простой класс, который будет иметь поля: цвет, название, вес. Создайте метод
        в классе через который можно будет вывести все эти данные. Добавьте два объекта,
        установите для них значения и выведите все при помощи ранее созданного метода.
        Также добавьте несколько конструкторов, которые будут устанавливать:
        ●	только цвет машины;
        ●	цвет и вес машины;
        ●	и пустой конструктор.*/



public class Truck {

    private String colour;
    private String name;
    private int weight;



    //конструктор и метод одно и тоже, создаем метод
    public Truck(String colour, String name, int weight) {
        this.colour = colour;
        this.name = name;
        this.weight = weight;
    }


    //создаем методы
    public String printColour() {
        return this.colour;
    }

    public String printColourAndWeight() {
        return colour + " " + weight;
    }

    public String printEmpty() {

        return null;
    }

    public String printAll() {
        return colour + " " + name + " " + weight ;
    }



    public static void main(String[] args) {
        //создание и установка параметров объекта МАН
        //Truck man = new Truck();
        //man.colour = "black";
        //man.name = "MAN";
        //man.weight = 1000;

        Truck man = new Truck("Black", "MAN", 1000 );
        System.out.println(man.printColourAndWeight());

        Truck volvo = new Truck("White", "Volvo", 1500 );
        System.out.println(volvo.printAll());

        Truck maz = new Truck("White", "Maz", 2000 );
        System.out.println(maz.printEmpty());

    }
}


