package homeLesson5;

//Найти максимальную сумму четырёх смежных целых чисел

public class Task4 {

    public static void main(String[] args) {

        int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44};
        int subMassiveLength=4;

        int maxSum=0;
        int subMassiveSum=0;

        for (int i = 0; i < task04.length-subMassiveLength+1 ; i++) {

            for (int j = i; j < subMassiveLength+i; j++) {
                subMassiveSum +=task04[j];
            }
           // System.out.println(subMassiveSum);
            if(subMassiveSum>maxSum){
                maxSum=subMassiveSum;
            }
            subMassiveSum=0;
        }
        System.out.println("Максимальная сумма четырёх смежных целых чисел " + maxSum);
    }
}

