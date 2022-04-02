package org.lessons2;



public class Car {
    private String colour;
    private Integer horsePower;



    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }


    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    public Integer getHorsePower() {

        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {

        this.horsePower = horsePower;
    }

    //создаю еще один метод
    public static String infoCar () {
        //String s = "drive normally"; // но лучше сразу писать в ретерн
        return "drive normally";
    }




}
