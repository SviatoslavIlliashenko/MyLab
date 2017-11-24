package Lab_2_8;

public class Circle extends Shape implements Comparable {

    private double radius;



    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("This is Circle,color : " + getColor() + "\n" + "radius = " + radius + "\n" + "area is : " + calculateArea());
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.calculateArea() > circle.calculateArea()) return 1;
        if (this.calculateArea() < circle.calculateArea()) return -1;
        return 0;
    }
}
