package lab_2_14.testGenerics3;


public class MyMixer<T> {



    static public <T> void shuffle(T[] array) {
        for (int i = 0; i < array.length; i++) {

            int s=array.length-1;
            T tmp = array[s];
            array[s] = array[i];
            array[i] = tmp;


        }
    }

    static public <T> void print(T[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
