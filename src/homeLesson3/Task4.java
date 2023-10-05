package homeLesson3;

//Дана переменная monthNumber, которая хранит порядковый номера месяца.
// И переменная isLeap, которая хранит информацию о том, является ли год високосным.
//
//        Написать программу, которая в зависимости от значения monthNumberвыводит
//        в консоль количество дней в этом месяце. Необходимо рассмотреть два случая: год не является високосным и год является високосным.

public class Task4 {

    public static void main(String[] args) {

        int monthNumber = 2;
        boolean isLeap =false;

        switch (monthNumber){
            case 1 , 3,5,7,8,10,12 -> System.out.println("This month has 31 days");
            case 2-> {
                if (isLeap)
                    System.out.println("This month has 29 days");
                else
                    System.out.println("This month has 28 days");
            }
            case 4, 6,9,11 ->System.out.println("This month has 30 days");


        }

    }
}

