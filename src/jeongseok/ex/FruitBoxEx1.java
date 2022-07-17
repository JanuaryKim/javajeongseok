package jeongseok.ex;

import java.util.ArrayList;

public class FruitBoxEx1 {
    public static void main(String[] args) {

        Box<Apple> box = new Box<>();
        box.add(new Apple());
        box.add(new Apple());

        Box<Rice> riceBox = new Box<>();
        riceBox.add(new Rice());


        ArrayList<Apple> arrayList = box.getList(); //box객체 내부에서 제네릭 타입을 Apple로 했어도 참조 변수가 Object처럼 취급하기에
                                                    //제네릭 안 쓰면 에러
        for (Apple apple: arrayList) {
            String string = apple.toString();
            System.out.println(string);
        }

        Box<Fruit> fruitBox = new Box<>();

        fruitBox.add(new Melon());

        System.out.println(fruitBox.get().toString());


    }
}


class Fruit {
    public String toString(){return this.getClass().getName();};
}


class Apple extends Fruit {
    public String toString(){return this.getClass().getName();};
}


class Melon extends Fruit {
    public String toString(){return this.getClass().getName();};
}

class Rice {
    public String toString(){return this.getClass().getName();};
}



class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    public T get(){

        if(!(list.size() > 0))
        {
            return null;
        }

        return list.get(list.size() - 1);
    }

    public ArrayList<T> getList()
    {
        return list;
    }
}
