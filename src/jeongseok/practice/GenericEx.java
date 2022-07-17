package jeongseok.practice;

import java.util.ArrayList;
import java.util.List;

class GenericClass<T> {
    List<T> list = new ArrayList<>(100);

    public void add(T item) { list.add(item); }
    public T get(int index) { return list.get(index); }
}
class Fruit {}
class Apple extends Fruit {}

public class GenericEx {
    public static void main(String[] args) {
        GenericClass<Fruit> genericClass = new GenericClass<>(); //타입매개변수를 Fruit으로 지정
        genericClass.add(new Apple()); //Apple은 Fruit의 하위 클래스이므로 자바의 다형성 특징으로 인해 가능
    }
}




//public class GenericEx {
//    public static void main(String[] args) {
//        GenericClass<String> genericClass = new GenericClass<>();
//        genericClass.add(new String("value"));
////        genericClass.add(new Integer(1)); //에러 발생 (타입 안정성)
//        String item = genericClass.get(0);
//        System.out.println(item);
//    }
//}