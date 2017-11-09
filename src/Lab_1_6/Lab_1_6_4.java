package Lab_1_6;

import java.util.Arrays;
public class Lab_1_6_4 {
    public static void main(String[] args) {

        int[] array ={2,4,1,7,8,0,9};


        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();

        Arrays.sort(array);


        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();

        System.out.println(Arrays.binarySearch(array,8));


    }
}
