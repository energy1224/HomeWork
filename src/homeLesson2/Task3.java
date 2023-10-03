package homeLesson2;
//Найти сумму цифр целого положительного двузначного числа.
// Результат вывести в консоль.
public class Task3 {

    public static void main(String[] args) {

        int number= 43;
        int digit1= number/10;
        int digit2 = number%10;

        int sumOfDigits= digit1+digit2;


        System.out.println(sumOfDigits);

    }

}
