package ch11.practice.subPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorPractice {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(45);
        arrayList.add(4);
        arrayList.add(23);
        arrayList.add(2);
        arrayList.add(100);


        Iterator iterator = arrayList.iterator();
        System.out.println("========= Iterator =========");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        int value = (int)iterator.next(); //에러, 이미 컬랙션의 데이터를 끝까지 읽어 온 iterator 이기 때문에 다시 생성해서 사용해야한다
        Iterator newIterator = arrayList.iterator();

//        while (newIterator.hasNext()) {
//            newIterator.remove();        //에러, remove는 iterator 내부적으로 읽어 왔던 데이터를 삭제하므로 next 없이 사용하면 에러발생
//        }

        System.out.println("========= Iterator =========");
        System.out.println();
        System.out.println("========= ListIterator =========");
        ListIterator listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("==================");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());  //ListIterator는 데이터의 끝까지 갔어도 previous로 이전 데이터 탐색가능
        }
        System.out.println("========= ListIterator =========");
    }
}
