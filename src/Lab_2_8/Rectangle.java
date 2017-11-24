package Lab_2_8;

public class Rectangle extends Shape implements Comparable {

    private double width;
    private double height;

    Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("This is Rectangle,color : " + getColor() + "\n" + "width : " + width + "\n" + "height : " + height + "\n" + "area is : " + calculateArea());

    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.calculateArea() > rectangle.calculateArea()) return 1;
        if (this.calculateArea() < rectangle.calculateArea()) return -1;
        return 0;
    }

}




