package homeLesson4;

//Программа загадывает число в диапазоне [1;9]
//        Пользователь вводит число с клавиатуры
//        Программа в зависимости от введенного числа выводит в консоль следующее:
//        "загаданное число больше"
//        "загаданное число меньше"
//        "Вы угадали" (программа завершает работу)
//        Если введен 0, вывести "выход из программы" (программа завершает работу)

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hiddenNumber = (int) (Math.random()  * (10-1) + 1);
        System.out.println(hiddenNumber);
        int num;


        System.out.println("Введите число");


        while (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num > hiddenNumber){
                System.out.println("Введенное число больше");
                System.out.println("Введите число");
            }
            else if (num < hiddenNumber) {
                System.out.println("Введенное число меньше");
                System.out.println("Введите число");

            }else {
                System.out.println("Вы угадали");
                break;
            }

        }
    }

}








