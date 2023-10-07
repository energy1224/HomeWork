package homeLesson3;

//Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка
// [10;500] в интервал (25;200) и выводить результат в консоль.

public class Task1 {

    public static void main(String[] args) {


        int num = (int) (Math.random() * (500 - 10)) + 10;

        if (num > 25 && num < 200) {
            System.out.println("Число " + num + " содержится в интервале (25;200)");
        } else {
            System.out.println("Число " + num + " не содержится в интервале (25;200)");
        }


    }
}
