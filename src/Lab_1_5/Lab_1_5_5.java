package Lab_1_5;
import java.util.Scanner;
public class Lab_1_5_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        float avg = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
            avg =(float) sum / n;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
