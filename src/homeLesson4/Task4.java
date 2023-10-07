package homeLesson4;

//Пользователь загадывает число в диапазоне от [1 до 100].
//        Пользователь загадывает в уме, программа не хранит это число, а пытается его угадать.
//        Программа пытается его угадать (вместо обычного перебора постарайтесь
//        использовать метод бинарного поиска, т.е деление отрезка на 2, пока число не будет найдено).
//        Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...? и, в зависимости от ответа пользователя, принимать решения.
//        Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
//        Для вывода текста и значения переменной используйте оператор сложения, например System.out.println("Число равно " + number);
//
//        середина отрезка: a = 1, b = 100; mid = (a + b) / 2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int a = 1;
        int b = 100;
       int guessInput;

        Scanner sc = new Scanner(System.in);
        int mid =(a + b) / 2;

        while (true){
            System.out.println("Число равно: " + mid + " ?");
            guessInput = sc.nextInt();
                    if (guessInput==0){
                        System.out.println("Число больше: " + mid+ " ?");
                        guessInput = sc.nextInt();
                        if(guessInput ==0){
                            b=mid;
                            mid =(a+b-1)/2;
                        }
                        else {
                            a=mid;
                            mid= (a+b+1)/2;
                        }

                    }
                    else {
                        guessInput=mid;
                        System.out.println("Вы угадали число " + guessInput );
                        break;
                    }

        }


    }
}
