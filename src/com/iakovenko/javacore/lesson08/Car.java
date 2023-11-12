package com.iakovenko.javacore.lesson08;

public class Car extends Vehicle implements Colourable {
//Машина наследуется от Транспортного средства и расширяет его свойством String color со значением по умолчанию -
//   белый.
    private String colour ="белый";

//Необходимо реализовать класс таким образом, чтобы значение по умолчанию для максимальной скорости было рано 240.
    public Car(String number) {
        super(number);
        this.maxSpeed = 240;
    }


    // В классе добавить возможность изменения цвета.


    //Реализация метода repair: уменьшение уровня износа на 1, но не меньше 0
    // наследует от родителя.
    public void stop(){

    }
    @Override
    public void changeColour(String col) {
        this.colour=col;

    }
    @Override
    public void setDefaultColour() {
        colour=super.defaultColour;

    }

    @Override
    public String getColor() {
        return colour;

    }
}
