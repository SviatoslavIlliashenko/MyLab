package lab_2_10.myShapes;

public class Circle extends Shape implements Comparable {

    private double radius;


    Circle(String name,String color, double radius) {
        super(color,name);
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




    public static Circle parseCircle(String string) {

        String[] arrayString = string.split(":");

        return new Circle(arrayString[0],arrayString[1], Double.parseDouble(arrayString[2]));



    }


    @Override
    public String toString() {
        return "This is " + name + " ,color :" + color + " ,radius :" + radius;
    }
}
