package Lab_2_8;

public abstract class Shape implements Drawable {


    String color;


    Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public String getColor() {
        return color;
    }


}
