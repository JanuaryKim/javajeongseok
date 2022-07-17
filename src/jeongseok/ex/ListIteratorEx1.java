package jeongseok.ex;


import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");


        ListIterator listIterator = arrayList.listIterator();

        listIterator.next();
        listIterator.remove();
        listIterator.next();
        listIterator.remove();
        System.out.println(arrayList);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            listIterator.remove();

        }

        System.out.println(listIterator.hasNext());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


    }
}
