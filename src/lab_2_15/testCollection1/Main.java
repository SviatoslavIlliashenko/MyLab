package lab_2_15.testCollection1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add("number " + i);

        }
        for (String i : list) {
            System.out.println(i);
        }



    }
}
