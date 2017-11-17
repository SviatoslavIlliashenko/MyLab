package Lab_2_7.MyShape;

public class Shape {

    private String color;

    Shape(String color) {
        this.color=color;
    }

    @Override
    public String toString() {
        return color;
    }



    public void calculateArea() {

        System.out.println(0.0);
    }


    public String getColor() {
        return color;
    }


}
