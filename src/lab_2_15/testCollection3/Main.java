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


        ListIterator<String> listIterator = list2.listIterator();
        int index = 0;
        while (listIterator.hasNext() && index < list1.size()) {

            listIterator.next();

            listIterator.add(list1.get(index));
            index++;
        }

        index = 0;
        while (listIterator.hasPrevious() && index < list1.size()) ;
        {
             listIterator.previous();
            listIterator.add(list1.get(index));

            index++;
        }

        printElements(list2);


    }

    public static void printElements(List list) {

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
