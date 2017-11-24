package Lab_2_8;

public class Triangle extends Shape implements Comparable {

    private int a;
    private int b;
    private int c;

    Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("This is Triangle,color : " + getColor() + "\n" + "a : " + a + "\n" + "b : " + b + "\n" + "c : " + c + "\n" + "area is : " + calculateArea());
        
    }

    @Override
    public double calculateArea() {
        int s = (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) o;
        if (this.calculateArea() > triangle.calculateArea()) return 1;
        if (this.calculateArea() < triangle.calculateArea()) return -1;
        return 0;
    }

}
