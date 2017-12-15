package lab_2_17.testThread2;

import java.util.Arrays;

public class MySumCount extends Thread {


    private int startIndex;
    private int stopIndex;
    private long resultSum;
    private int[] array;


    @Override
    public void run() {

        for (int i = startIndex; i <= stopIndex; i++) {
            resultSum +=array[i];
        }
        System.out.println("resultSum is : " + resultSum);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public long getResultSum() {
        return resultSum;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }


}
