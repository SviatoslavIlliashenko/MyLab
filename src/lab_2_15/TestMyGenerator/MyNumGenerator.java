package lab_2_15.TestMyGenerator;

import java.util.*;

public class MyNumGenerator {

    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }


    public static List generate(int numOfElm, int maxNumb) {

        List list = new ArrayList();
        Random random = new Random();

        for (int i = 0; i < numOfElm; i++) {
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }


    public static Set generateDistinct(int numOfElm, int maxNumb) {

        Set set = new HashSet();
        Random random = new Random();

       while(set.size()<numOfElm){
            set.add(random.nextInt(maxNumb));
        }


        return set;
    }


}
