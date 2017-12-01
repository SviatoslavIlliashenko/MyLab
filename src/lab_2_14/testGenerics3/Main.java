package lab_2_14.testGenerics3;

public class Main {

    public static void main(String[] args) {


        Integer[] array = {1,2,3,4,5};
        String[] arrayString = {"one", "two", "three", "four", "five"};


        MyMixer.shuffle(array);
        MyMixer.print(array);

        System.out.println("\t");

        MyMixer.shuffle(arrayString);
        MyMixer.print(arrayString);


    }
}
