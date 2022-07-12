package ch11.practice.subPractice;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetPractice {
    public static void main(String[] args) {
        Set set = new HashSet();

        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set.add(3));
        System.out.println(set.add(1));
        System.out.println(set.add("1"));

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
