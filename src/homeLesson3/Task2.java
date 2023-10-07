package homeLesson3;

//Дана переменная currentScoreValue - количество очков, набранное пользователем.
//
//        Если пользователь набрал 90 и более очков, он занял первое место.
//        Если пользователь набрал от 80 до 89, он занял второе место.
//        Если пользователь набрал от 70 до 79, он занял третье место.
//        Если пользователь набрал меньше 70, он не занял никакого места.
//        Вывести в консоль, какое место занял пользователь.

public class Task2 {

    public static void main(String[] args) {

        int currentScoreValue = 85;


        if (currentScoreValue >= 90)
            System.out.println("Пользователь занял первое место");
        else if (/*currentScoreValue <= 89 &&*/ currentScoreValue >= 80)
            System.out.println("Пользователь занял второе место");
        else if (/*currentScoreValue <= 79 &&*/ currentScoreValue >= 70)
            System.out.println("Пользователь занял третье место");

        else
            System.out.println("Пользователь не занял никакого места");


    }
}

