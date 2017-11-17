package Lab_2_7.MyShape;

public class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return "This is Rectangle,color : " + getColor() + "\n" + "width : " + width + "\n" + "height : " + height;
    }

    public void calculateArea() {

        System.out.println("area is : " + width * height);
    }
}
