package jeongseok.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("A");
        arrayList.add("V");
        arrayList.add("F");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
