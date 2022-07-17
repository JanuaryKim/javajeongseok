package jeongseok.ex;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {

        Set hashSet = new HashSet();

        Object[] objArr = {"1", new Integer(1), "2", "2", "2", "3", "3", "3", "4"};

        for (Object obj : objArr) {
            System.out.println(hashSet.add(obj));
        }

        System.out.println(hashSet.toString());
    }
}
