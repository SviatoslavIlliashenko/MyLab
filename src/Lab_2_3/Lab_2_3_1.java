package Lab_2_3;

import java.util.Scanner;

public class Lab_2_3_1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        MyWindow[] array = new MyWindow[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = new MyWindow(4);

            array[i].printFilds();
        }


    }
}

class MyWindow {
    private double height;
    private double wight;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;



    public MyWindow(double height) {
        this.height = height;

    }

    public MyWindow(double height, double wight) {
        this(height);
        this.wight = wight;
    }

    public MyWindow(double height, double widht, int numberOfGlass) {
        this(height, widht);
        this.numberOfGlass = numberOfGlass;
    }


    public MyWindow(double height, double widht, int numberOfGlass, boolean isOpen, String color) {
        this.height = height;
        this.wight = widht;
        this.numberOfGlass = numberOfGlass;
        this.isOpen = isOpen;
        this.color = color;
    }


    public void printFilds() {

        System.out.println(height + "\n" + wight + "\n" + numberOfGlass + "\n" + color + "\n" + isOpen);
        System.out.println("----------");
    }





}
