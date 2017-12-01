package lab_2_14.testGenerics2;

import lab_2_14.testGenerics3.MyMixer;

public class Main {
    public static void main(String[] args) {

        Integer[] array={1,2,3,4,5};

        System.out.println("Number of elements that are greater than :" + MyTestMethod.calculateNumber(array,3));

        System.out.println("Sum of elements :"  + MyTestMethod.calculateSum(array,3));

    }
}
