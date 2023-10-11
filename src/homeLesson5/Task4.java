package homeLesson5;

//Найти максимальную сумму четырёх смежных целых чисел

public class Task4 {

    public static void main(String[] args) {

        int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44};
        int subMassiveLength=4;

        int maxSum=0;
        int subMassiveSum=0;
        int wStart =0;
        int wEnd;


        for ( wEnd = 0; wEnd < task04.length; wEnd++) {
            subMassiveSum +=task04[wEnd];
            if (wEnd==subMassiveLength-1+wStart){
                if(subMassiveSum>maxSum) {
                    maxSum = subMassiveSum;
                }
                subMassiveSum-=task04[wStart];
                wStart++;
            }

        }
        System.out.println("Максимальная сумма четырёх смежных целых чисел " + maxSum);

    }
}

