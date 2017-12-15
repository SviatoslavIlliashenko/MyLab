package lab_2_17.testThread2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MySumCount mySumCount1 = new MySumCount();
        Thread thread1 = new Thread(mySumCount1);

        int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        mySumCount1.setArray(array);
        mySumCount1.setStartIndex(2);
        mySumCount1.setStopIndex(4);
        mySumCount1.start();




        MySumCount mySumCount2 = new MySumCount();
        Thread thread2 = new Thread(mySumCount1);

        mySumCount2.setArray(array);
        mySumCount2.setStartIndex(5);
        mySumCount2.setStopIndex(8);
        mySumCount2.start();



    }
}
