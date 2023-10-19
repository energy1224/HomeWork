package com.iakovenko.javacore.lesson08;
// Самокат наследуется от Велосипеда и расширяет его свойством boolean isElectric
public class Scooter extends Bicycle implements Colourable {

    // Самокат наследуется от Велосипеда и расширяет его свойством boolean isElectric
    private boolean isElectric;


    //    Значения isElectric и максимальная скорость всегда устанавливается через конструктор.
    // Количество колёс самоката всегда равно 2, а тип - "Городской". - наследует от велосипеда
    public Scooter(String number, int maxSpeed, boolean isElectric) {
        super(number, maxSpeed);
        this.isElectric= isElectric;
    }



//            Реализация метода repair: если самокат электрический,
//            уровень износа уменьшается на 2, в противном случае на 3, но не  меньше 0

@Override
        public void repair(){
        if (isElectric){
            if (levelOfWare >= 2)levelOfWare -= 2;
            else levelOfWare =0;

        }else {
            if  (levelOfWare >= 3) levelOfWare -= 3;
            else levelOfWare =0;
        }

    }

    @Override
    public void changeColour(String col) {
        this.defaultColour=col;
    }
    @Override
    public void setDefaultColour() {
        defaultColour=getDefaultColour();


    }
}
