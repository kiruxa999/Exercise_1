package org.lessons2class;


/*4. Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева.
Создайте три конструктора:
        ●	Конструктор, который устанавливает только возраст и название;
        ●	Конструктор, который устанавливает все переменные в классе;
        ●	Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».

        Создайте три объекта на основе класса и используйте по одному конструктору на каждый.*/



public class Tree {
    int year;
    String live;
    String name;

    public Tree(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public Tree(int year, String live, String name) {
        this.year = year;
        this.live = live;
        this.name = name;
    }


    public Tree() {
        System.out.println("«Пустой конструктор без параметров сработал»");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "year=" + year +
                ", live='" + live + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Tree oak = new Tree();

        Tree birch = new Tree(20,"Береза");
        System.out.println(birch);

        Tree pine = new Tree(20,"Не живое", "Сосна");
        System.out.println(pine);
    }

}
