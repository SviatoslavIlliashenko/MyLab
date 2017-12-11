package lab_2_10.myShapes;


public abstract class Shape implements Drawable {

    String color;
    String name;


    Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public abstract double calculateArea();

    public String getColor() {
        return color;
    }


    public static Shape parseShape(String string) {

        String[] arrayString = string.split(":");


        switch (arrayString[0]) {

            case "Circle":
                return Circle.parseCircle(string);

            case "Rectangle":
                return Rectangle.parseRectangle(string);


            default:
                return null;
        }

    }

}
