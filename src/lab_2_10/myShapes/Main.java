package lab_2_10.myShapes;



import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        Shape[] shapes = new Shape[2];

        shapes[0] = Shape.parseShape("Circle:GREEN:10");
        shapes[1] = Rectangle.parseShape("Rectangle:RED:11,22");


       for(Shape i : shapes){
           System.out.println(i);
       }

    }
}
