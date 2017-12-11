package lab_2_10.WrapperDemo;

public class Main {
    public static void main(String[] args) {


        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);
        Integer x4 = Integer.parseInt("10");

        Integer x5=128;
        Integer x6=Integer.valueOf(128);


        System.out.println(x1==x2);
        System.out.println(x2==x3);
        System.out.println(x3==x4);

        System.out.println(x1.equals(x2));
        System.out.println(x2.equals(x3));
        System.out.println(x3.equals(x4));

        System.out.println(x5==x6);
        System.out.println(x5.equals(x6));
    }
}
