package lab_2_10.WrapperDemo2;

public class Main {
    public static void main(String[] args) {

        Integer num1 = 100;
        Byte num2 = 10;
        System.out.println(compute(num1,num2));


    }

    public static Long compute(Integer num1, Byte num2) {

        return Long.valueOf(num1 + num2);
    }

}
