package homeLesson6;

//        ### Задача #2
//
//        Даны две строки, строки, содержащие только буквы английского алфавита. Вывести информацию о том, являются ли одна строка
//        анаграммой другой строки.

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        String str01 = "ABBA";
        String str02 = "BABA";

        char[] char01 = str01.toCharArray();
        char[] char02 = str02.toCharArray();


        // вариант 1 . через  StringBuilder

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb1.append(str01);
        sb2.append(str02);

        for (int i = 0; i < sb1.length(); i++) {
            int index = sb2.indexOf(String.valueOf(sb1.charAt(i)));
            if (index >= 0) sb2.deleteCharAt(index);
            else break;
        }
        if (sb2.length() == 0) {
            System.out.println("String " + str01 + " is anаgram of String " + str02);
        } else {
            System.out.println("String " + str01 + " is not anаgram of String " + str02);
        }

       // Вариант 2 . через Arrays.sort();


        Arrays.sort(char01);
        Arrays.sort(char02);

        System.out.println(Arrays.toString(char01));
        System.out.println(Arrays.toString(char02));

        if (Arrays.compare(char01, char02) == 0) {
            System.out.println("String " + str01 + " is anаgram of String " + str02);
        } else {
            System.out.println("String " + str01 + " is not anаgram of String " + str02);
        }


    }
}
