package lab_2_15.TestMap1;

import java.util.HashMap;
import java.util.Map;

public class MyTranslator {


    private HashMap<String, String> dictionary;


    public MyTranslator() {
        this.dictionary = new HashMap<>();
    }

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }


    public void translate(String en) {
        System.out.println(dictionary.get(en));
    }

    public void functionString(String string) {

        String[] arrayString = string.split(" ");
        for (int i = 0; i < arrayString.length; i++) {

            //TODO

        }

    }


    public void soutDictionary() {
        System.out.println(dictionary);
    }
}
