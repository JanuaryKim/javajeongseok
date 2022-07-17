package jeongseok.practice;

public class MyVector_Main {
    public static void main(String[] args) {
        MyVector myVector = new MyVector(2);

        myVector.add("A");
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);

        myVector.add("B");
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);

        myVector.remove(1);
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);


        myVector.add("C");
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);

        myVector.add(1,"D");
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);

        myVector.add(0,"M");
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);

        myVector.ensureCapacity(10);
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);

        myVector.setSize(2);
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);

        myVector.setSize(8);
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);

        myVector.remove(8);
        System.out.println(myVector);
        System.out.println(myVector.size);
        System.out.println(myVector.capacity);



//        MyVector2 myVector2 = new MyVector2(2);
//
//        myVector2.add("A");
//        System.out.println(myVector2);
//        System.out.println(myVector2.size);
//        System.out.println(myVector2.capacity);
//
//        myVector2.add("B");
//        System.out.println(myVector2);
//        System.out.println(myVector2.size);
//        System.out.println(myVector2.capacity);
//
//        myVector2.add("C");
//        System.out.println(myVector2);
//        System.out.println(myVector2.size);
//        System.out.println(myVector2.capacity);
//
//        myVector2.add(2,"D");
//        System.out.println(myVector2);
//        System.out.println(myVector2.size);
//        System.out.println(myVector2.capacity);

    }


}
