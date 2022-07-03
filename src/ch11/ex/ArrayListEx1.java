package ch11.ex;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();

        list1.add(new Integer(1));
        list1.add(new Integer(10));
        list1.add(new Integer(5));
        list1.add(new Integer(2));
        list1.add(new Integer(7));

        ArrayList list2 = new ArrayList(list1.subList(1,4));



        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);

        print(list1, list2);


        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));



        list1.add(3, "A"); //3 위치에 더하기

        print(list1, list2);

        list1.set(3, "BA"); //3 위치에 대입하기




        print(list1, list2);

        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); //list2 내용 제외하고 모두 삭제

        print(list1, list2);

    }

    public static void print(ArrayList list1, ArrayList list2)
    {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
