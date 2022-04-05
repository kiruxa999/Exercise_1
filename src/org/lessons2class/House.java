package org.lessons2class;

//3. Создайте класс Дом. Добавьте в него следующие данные:
//●	поля: количество этажей, год постройки, наименование;
//●	метод для установки всех значений;
//●	метод для вывода всех значений;
//●	метод, возвращающий количество лет с момента постройки.
//
//На основе класса создайте два объекта и пропишите для каждого характеристики.
// Добавление характеристик реализуйте через метод класса.
//
//Выведите информацию про каждый объект.


public class House {
    int floor;
    int year;
    String name;

    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    //установка значений с помщью гет и сет
    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // метод для вывода всех значений
    public String printAll() {
        return floor + " " + year + " " + name ;
    }

    //вывод с момента постройки
    public int pointBuild() {
        int mainYear = 2022;
        return  mainYear - year;
    }


    public static void main(String[] args) {
        House house1 = new House();
        house1.setFloor(5);
        house1.setYear(1970);
        house1.setName("Магнит");
        System.out.println(house1.printAll());
        System.out.println("Вот столько ему лет   " + house1.pointBuild());



        House house2 = new House();
        house2.setFloor(9);
        house2.setYear(1980);
        house2.setName("Лента");
        System.out.println(house2.printAll());
        System.out.println("Вот столько ему лет   " + house2.pointBuild());
    }

}
