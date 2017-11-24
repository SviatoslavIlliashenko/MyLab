package Lab_2_8;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {





        System.out.println();

        Circle circle1 = new Circle("blue", 45);

        circle1.draw();

        Circle circle2 = new Circle("blue", 30);
        circle2.draw();

        System.out.println(circle1.compareTo(circle2));
        System.out.println("----------------");

        Shape[] shapes = new Shape[3];

        shapes[0] = new Triangle("Yellow", 10, 8, 4);
        shapes[1] = new Triangle("Orange", 12, 9, 6);
        shapes[2] = new Triangle("Black", 11, 9, 5);

        Arrays.sort(shapes);

        for (Shape shape : shapes) {
            shape.draw();
        }

        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        });

        System.out.println("------------");
        for (Shape shape : shapes) {
            shape.draw();
        }


    }
}
