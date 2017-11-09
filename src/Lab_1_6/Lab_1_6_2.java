package Lab_1_6;

public class Lab_1_6_2 {
    public static void main(String[] args) {

        int[] mas = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int min = mas[0];
        int max = mas[0];
        int avg = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
            if (mas[i] > max) {
                max = mas[i];
            }
            avg = (min + max) / 2;

        }
        System.out.println("Minimum value : " + min);
        System.out.println("Maximum valur : " + max);
        System.out.println(avg);


    }
}
