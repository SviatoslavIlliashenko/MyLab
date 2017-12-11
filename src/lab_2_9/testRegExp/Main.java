package lab_2_9.testRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final Pattern PATTERN = Pattern.compile("([A-Za-z1-9])+");

    public static void main(String[] args) {



        String[] arrayString = new String[]{"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat"};

        for (String i : arrayString) {
            System.out.println(checkPersonWithRegExp(i));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {

        return PATTERN.matcher(userNameString).matches();

    }
}
