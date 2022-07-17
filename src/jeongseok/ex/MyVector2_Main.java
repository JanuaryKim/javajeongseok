package jeongseok.ex;

public class MyVector2_Main {
    public static void main(String[] args) {
        MyVector2 myVector2 = new MyVector2();

        myVector2.add("1");
        myVector2.add("2");
        myVector2.add("3");
        myVector2.add("4");

        Object next = myVector2.next();
        System.out.println(next);
        myVector2.remove();
//        myVector2.remove();
        Object next2 = myVector2.next();
        System.out.println(next2);
    }
}
