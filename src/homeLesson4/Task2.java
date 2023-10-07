package homeLesson4;

//Для введённого пользователем с клавиатуры
// целого положительного числа
// посчитайте сумму всех его цифр

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        int num = scanner.nextInt();
        int sum = 0;

        if (num < 10) sum = num;
        else {
            while (num > 9) {
                sum = sum + num % 10;
                num = num / 10;
            }
            sum +=num;
        }
        System.out.println("Сумма всех чисел введенного числа: " + sum);


    }
}
