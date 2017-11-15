package Lab_2_4;

public class Lab_2_4_1 {

    public static void main(String[] args) {
int[] array=new int[]{3,5,7,9};
        System.out.println(MyMath.findMin(array));
        System.out.println(MyMath.findMax(array));

        System.out.println(MyMath.areaOfCircle(50));
    }
}

class MyMath {
    final static double PI = 3.14;


    public static double  areaOfCircle(int radius){

        return radius*radius*PI;
    }



    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i ] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array){
        int max=array[0];
        for(int i=0;i<array.length;i++){

            if(array[i]>max){
                max=array[i];
            }

        }
        return max;
    }




}