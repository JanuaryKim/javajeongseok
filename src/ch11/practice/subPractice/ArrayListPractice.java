package ch11.practice.subPractice;

import java.util.*;

class ArrayListPractice {

    public static void main(String[] args) {
        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.method();
    }

    public void method() {
        Set set = new HashSet();

        set.add(3);
        set.add(10);
        set.add(18);
        set.add(22);
        set.add(22);
        set.add(22);

        Iterator hashSetIterator = set.iterator();

        System.out.println();
        System.out.println("==== HashSet의 요소 출력 ====");

        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }

        System.out.println("==== HashSet의 요소 출력 ====");
        System.out.println();

        System.out.println("==== ArrayList의 요소 출력 ====");

        ArrayList arrayList = new ArrayList(set);

        Iterator arrayListIterator = arrayList.iterator();

        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("==== ArrayList의 요소 출력 ====");

        arrayList.ensureCapacity(10); // size가 아니다. 직접적인 배열의 최소 크기를 설정한다


    }
}
