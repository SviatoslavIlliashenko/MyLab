package Lab_2_2;

public class Lab_2_2_5 {

    public static void main(String[] args) {
        A a1 =new A();
        a1.calculateSquare(10.0);
        a1.calculateSquare(10);
        a1.calculateSquare(10,2);

    }
}

class A {

    private double square;

    public void calculateSquare(double a, double b) {
        square = a * b;
        System.out.println("Square of rectangle : " + square);
    }


    public void calculateSquare(int a) {
        square = a * a;
        System.out.println("Square of foursquare : " + square);
    }

    public void calculateSquare(double radius) {
        square = 2 * (radius * radius) * Math.PI;
        System.out.println("Square of circle : " + square);
    }


}