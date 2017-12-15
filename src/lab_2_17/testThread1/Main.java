package lab_2_17.testThread1;

public class Main {
    public static void main(String[] args) {





        MyTimeBomb myTimeBomb=new MyTimeBomb();
        Thread bomb1=new Thread(myTimeBomb);
        bomb1.start();
       // myTimeBomb.run();

    }
}
