package homeLesson5;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] massiv = new int[15];

        for (int i = 0; i < massiv.length; i++) {
            massiv[i]= (int) (Math.random()  * 100);

        }
        System.out.println(Arrays.toString(massiv));


    }
}


