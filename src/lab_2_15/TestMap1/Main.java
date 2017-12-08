package lab_2_15.TestMap1;

import static lab_2_15.TestMap1.MyTranslator.*;

public class Main {


    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();

        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("dog", "собака");

        myTranslator.soutDictionary();

        myTranslator.translate("cat");

    }

}
