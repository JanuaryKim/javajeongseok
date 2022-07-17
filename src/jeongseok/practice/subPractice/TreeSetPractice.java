package jeongseok.practice.subPractice;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add(90);
        treeSet.add(45);
        treeSet.add(120);
        treeSet.add(888);

        Iterator iterator = treeSet.iterator();

        System.out.println();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
