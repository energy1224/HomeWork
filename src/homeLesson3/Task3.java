package homeLesson3;

//Даны переменные x и y - координаты точки на плоскости.
//
//        Необходимо определить четверть координатной плоскости, которой принадлежит данная точка. Результат вывести в консоль.
//
//        Если обе координаты положительны, точка принадлежит первой четверти.
//        Если координата x отрицательна, а y положительна, точка принадлежит второй четверти.
//        Если обе координаты отрицательны, точка принадлежит третьей четверти.
//        Если координата x положительна, а y отрицательна, точка принадлежит четвёртой четверти.

public class Task3 {
    public static void main(String[] args) {

        double x = -0.5;
        double y = -6;

        if (x > 0 && y > 0) {
            System.out.println("Point is in first quarter");
        } else if (x < 0 && y > 0) {
            System.out.println("Point is in second quarter");
        } else if (x < 0 && y < 0) {
            System.out.println("Point is in third quarter");
        } else if (x > 0 && y < 0) {
            System.out.println("Point is in forth quarter");

        }

    }
}







