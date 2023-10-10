package homeLesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int indexArray1 = 0;
        int indexArray2 = 0;

        int userInput;

        while (array1[array1.length-1] ==0 || array2[array2.length-1]==0) {
            System.out.println("Введите целое  число ");
            userInput = scanner.nextInt();

            if (userInput > 0 && indexArray1<array1.length) {
                array1[indexArray1] = userInput;
                indexArray1++;
            }
            if (userInput < 0 && indexArray2<array2.length ) {
                array2[indexArray2] = userInput;
                indexArray2++;
            }
            if (userInput == 0)
                break;

        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}

