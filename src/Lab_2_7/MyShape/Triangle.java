package Lab_2_7.MyShape;

public class Triangle extends Shape {

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
    public String toString() {
        return "This is Triangle,color : " + getColor() + "\n" + "a : " + a + "\n" + "b : " + b + "\n" + "c : " + c;
    }

    public void calculateArea() {

        int s = (a + b + c);
        System.out.println("area is : " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

}
