package ch11.practice.subPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorPractice {
    public static void main(String[] args) {

        ArrayList catList = new ArrayList();

        catList.add(new Cat(10, "냐옹"));
        catList.add(new Cat(3, "고랭이"));
        catList.add(new Cat(4, "냐냐옹"));
        catList.add(new Cat(12, "캣츠비"));

        Comparator<Cat> comparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {

                int result;

                if(o1.age > o2.age)
                    result  = 1;
                else if(o1.age == o2.age)
                    result  = 0;
                else
                    result  = -1;

                return result;
            }
        };

        Iterator iterator1 = catList.iterator();

        System.out.println("============ 정렬 전 ============");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("============ 정렬 전 ============");
        Collections.sort(catList, comparator);

        System.out.println("============ 정렬 후 ============");
        Iterator iterator2 = catList.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("============ 정렬 후 ============");
    }
}

class Cat {

    int age;
    String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("[%s : %d]", name, age);
    }
}
