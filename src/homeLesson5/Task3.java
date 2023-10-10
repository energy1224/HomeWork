package homeLesson5;

//Заполните массив на len элементов (размер массива вводит пользователь)
// случайным целыми числами и выведете максимальное,
// минимальное и среднее арифметическое значение элементов массива.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива");

        int len = sc.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
           int sum =0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        Arrays.sort(array);
        System.out.println("Максимальный элемент массива: "+ array[array.length-1]);
        System.out.println("Минимальный элемент массива: "+ array[0]);
        System.out.println("Cреднее арифметическое значение элементов массива: " + sum/len);






    }
}

