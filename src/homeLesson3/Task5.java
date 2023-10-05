package homeLesson3;


//Даны переменные couponNumber - номер купона и resultSum - сумма покупки.
//
//        Если номер купона - 1111, скидка 10%,
//        Если номер купона - 3333, скидка 20%,
//        Если номер купона - 5555, скидка 30%.
//        В остальных случаях скидка не предусмотрена.
//        Необходимо вычислить и сохранить в переменную resultSum сумму с учетом скидки, если она предусмотрена. Вывести значение resultSum в консоль.

public class Task5 {
    public static void main(String[] args) {

        int couponNumber = 6788;
        int resultSum = 300;

        resultSum = switch (couponNumber) {
            case 1111 -> {
                resultSum *= 0.9;
                System.out.println(resultSum);
                yield resultSum;
            }
            case 3333 -> {
                resultSum *= 0.7;
                System.out.println(resultSum);
                yield resultSum;
            }
            case 5555 -> {
                resultSum *= 0.5;
                System.out.println(resultSum);
                yield resultSum;
            }
            default -> {
                System.out.println(resultSum);
                yield resultSum;

            }

        };
    }
}






