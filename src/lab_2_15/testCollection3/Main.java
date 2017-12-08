package lab_2_15.testCollection3;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<String> list1 = new ArrayList();

        List<String> list2 = new LinkedList<>();


        for (int i = 0; i < 10; i++) {
            list1.add("number " + i);
            list2.add("number " + i);
        }


        Iterator<String> iteratorArray = list1.iterator();

        Iterator<String> iteratorLinked = list2.iterator();


        while (iteratorArray.hasNext()) {
            System.out.println(iteratorArray.next());
        }

        while (iteratorArray.hasNext()) {
            System.out.println(iteratorLinked.next());
        }


        ListIterator<String> listIterator=list2.listIterator();

int index=0;
        while (listIterator.hasNext()){

            listIterator.add(list1.get(index));
            index++;
        }



    }
}
