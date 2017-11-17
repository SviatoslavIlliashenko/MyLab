package Lab_2_7.MyShape;

public class Circle extends Shape {

    private double radius;


    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }



    @Override
    public String toString() {
        return "This is Circle,color : " + getColor() + "\n" +"radius = " + radius ;

    }

    public void calculateArea() {

        System.out.println("area is : " + radius * radius * 3.14);
    }

}