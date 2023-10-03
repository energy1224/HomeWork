package homeLesson2;

public class Task4 {
    public static void main(String[] args) {

        int a = 30;

        long b = 5463;

        System.out.println("a ="+a);
        System.out.println("b ="+b);

        System.out.println("Change values");

        int taburetka = a;
        a = (int)b;
        b = taburetka;

        System.out.println("a ="+a);
        System.out.println("b ="+b);





    }
}
