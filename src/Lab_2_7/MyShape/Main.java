package Lab_2_7.MyShape;

public class Main {
    public static void main(String[] args) {


        Shape shape = new Shape("red");
        System.out.println(shape.toString());
        shape.calculateArea();

        System.out.println();

        Circle circle = new Circle("blue", 45);
        System.out.println(circle.toString());
        circle.calculateArea();


        System.out.println();

        Rectangle rectangle = new Rectangle("orange", 12, 20);
        System.out.println(rectangle.toString());
        rectangle.calculateArea();


        System.out.println();


        Triangle triangle = new Triangle("bleck", 12, 35, 56);
        System.out.println(triangle.toString());
        triangle.calculateArea();
    }
}
