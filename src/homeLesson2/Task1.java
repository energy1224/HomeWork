package homeLesson2;


//объявите переменные для хранения информации
// об общем количестве писем и о количестве
// отправленных писем. Присвойте значения этим переменным.
// Выведите в консоль, сколько писем осталось отправить.
public class Task1 {

    public static void main(String[] args) {

        int allLeters;
        int sendedLeters;
        int unsentLeters;

        allLeters = 56;
        sendedLeters = 45;
        unsentLeters= allLeters-sendedLeters;

        System.out.println(unsentLeters);


    }
}
