package Lab_1_5;

public class Lab_1_5_4 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0 | i % 4 == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 10) {
                break;
            }
        }
    }
}
