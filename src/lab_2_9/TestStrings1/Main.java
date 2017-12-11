package lab_2_9.TestStrings1;

public class Main {
    public static void main(String[] args) {

        String myString = "abracadabra";
        System.out.println(myString.indexOf("rac"));
        System.out.println(myString.lastIndexOf("ra"));
        System.out.println(myString.substring(3, 7));

        System.out.println(reverseString(myString));
    }


    public static String reverseString(String myString) {

        StringBuilder stringBuilder = new StringBuilder(myString);
        return stringBuilder.reverse().toString();
    }
}
