package lab_2_17.testThread1;

public class MyTimeBomb extends Thread implements  Runnable {

    @Override
    public void run() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("BOOM!!!");
    }
}
