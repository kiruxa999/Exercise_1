package org.lessons2class;


//Допишите в класс «Study» конструктор, что будет принимать один параметр и будет устанавливать значение
//этого параметра в поле «course». Создайте объект класса «Study». В качестве значения для поля
//«course» установите текст: «Изучение Java - это просто!».
//Обратитесь к методу «printCourse» для вывода значения поля «course».



class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Study{" +
                "course='" + course + '\'' +
                '}';
    }

    //TODO

    public String printCourse() {
        return this.course;
    }
}

    class JavaProgram {
    public static void main(String[] args) {
        //TODO
    Study course = new Study("Java - это просто");
    System.out.println(course.printCourse());
    }
}

