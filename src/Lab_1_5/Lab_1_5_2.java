package Lab_1_5;


import java.util.Scanner;
public class Lab_1_5_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

/*
        if(x==1) System.out.println("one");
        else if(x==2) System.out.println("two");
        else if(x==3) System.out.println("three");
        else if(x==4) System.out.println("foure");
        else if(x==5) System.out.println("five");
        else if(x==6) System.out.println("six");
        else if(x==7) System.out.println("seven");
        else if(x==8) System.out.println("eight");
        else if(x==9) System.out.println("nine");
        else System.out.println("OTHER");
        */

        switch (x) {

            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("foure");
                break;

            case 5:
                System.out.println("five");
                break;

            case 6:
                System.out.println("six");
                break;

            case 7:
                System.out.println("seven");
                break;

            case 8:
                System.out.println("eight");
                break;

            case 9:
                System.out.println("nine");
                break;

            default:
                System.out.println("OTHER");
                break;
        }

    }
}