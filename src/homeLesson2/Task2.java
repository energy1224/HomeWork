package homeLesson2;
//Объявить и инициализировать переменные для хранения времени
// (в часах) и расстояния (в километрах).
// Найти и вывести в консоль скорость,
// выраженную в метрах в секунду.
public class Task2 {

    public static void main(String[] args) {

        double timeInHours = 2.5; // в часах
        double distanceInKilometers= 20.3; //километры

        double timeInSeconds = timeInHours*3600;
        double distanceInMeters= distanceInKilometers*1000;

        double speed = distanceInMeters/timeInSeconds;

        System.out.format(" Speed m/c : %.2f", speed);

    }

}
