package lab_2_10.myShapes;


public class Rectangle extends Shape implements Comparable {

    private double width;
    private double height;

    Rectangle(String name, String color, double height, double width) {
        super(color, name);
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

    public static Rectangle parseRectangle(String string) {

        String[] arrayString = string.split(":");
        String[] arrayString2 = arrayString[2].split(",");

        return new Rectangle(arrayString[0], arrayString[1], Double.parseDouble(arrayString2[0]), Double.parseDouble(arrayString2[1]));


    }


    @Override
    public String toString() {
        return "This is " + name + " ,color :" + color + " ,wight :" + width + " ,height :" + height;
    }
}




