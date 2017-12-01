package lab_2_15.testCollection2;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();


        for (int i = 0; i < 10; i++){
            list.add("number " + i);
        }

        Collections.shuffle(list);


        for (String i : list) {
            System.out.println(i);
        }


    }
}
