package lab_2_9.testTokennizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {


        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";



      splitByDot(myStr);
      splitBySpace(myStr);

    }

    public static void splitByDot(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }

    }

    public static void splitBySpace(String string) {

        StringTokenizer stringTokenizer = new StringTokenizer(string, ",");

        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }

    }

}
