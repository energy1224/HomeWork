package homeLesson6;

//
//        ### Задача #1
//
//        Дана строка, содержащая только буквы и цифры. Вывести информацию о том, является ли данная трока палиндромом.
//


public class Task1 {

    public static void main(String[] args) {

        String palindrom = "1abc3cba1";
        String notPalindrom = "1abc3def1";

        System.out.println("First option");

        char[] chars = palindrom.toCharArray();


        String result = "";
        for (int i = chars.length - 1; i >= 0; i--)
            result = result + chars[i];

        System.out.println(result);

        if(palindrom.equals(result)){
            System.out.println("This String is palidrom");
        } else {
            System.out.println("This String is not palidrom");
        }

        System.out.println("Second option");

        StringBuilder sb = new StringBuilder();
        sb.append(notPalindrom).reverse();

        System.out.println(sb);

        if(notPalindrom.equals(sb)){
            System.out.println("This String is palidrom");
        } else {
            System.out.println("This String is not palidrom");
        }

        System.out.println("Third option");


        int start = 0;
        int end = chars.length - 1;

        while (start < chars.length && end >= 0) {
            if (chars[start] == chars[end]) {
                start++;
                end--;
            } else {
                break;
            }
        }
        if (start == chars.length ) {
            System.out.println("This String is palidrom");
        } else {
            System.out.println("This String is not palidrom");


        }
    }
}
