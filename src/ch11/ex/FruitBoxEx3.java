package ch11.ex;

import java.util.LinkedList;
import java.util.List;

class Juicer {
    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {

        String juiceName = "";
        for(Fruit2 f : box.getList())
        {
            juiceName += f.toString();
        }

        return new Juice(juiceName);
    }


    static <T extends Fruit2> Juice makeJuice2(FruitBox2<T> box) {

        String juiceName = "";
        for(Fruit2 f : box.getList())
        {
            juiceName += f.toString();
        }

        return new Juice(juiceName);
    }

    static void defaultMakeJuice(){

        FruitBox2<Fruit2> box = new FruitBox2<>();
        box.add(new Fruit2());
        System.out.println(makeJuice(box));
    }
}
class  Juice {
    String name;

    Juice (String name) {
        this.name = name + "Juice";
    }
    public String toString(){
        return name;
    }
}


class FruitBox2 <T extends Fruit2> extends Box2<T> {
}

class Box2 <T> {
    List<T> list = new LinkedList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    List<T> getList(){
        return list;
    }

    int size(){
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

}

class Fruit2 {public String toString(){return "Fruit";}}
class Apple2 extends Fruit2 {public String toString(){return "Apple";}}
class Grape2 extends Fruit2 {public String toString(){return "Grape";}}

public class FruitBoxEx3 {


    public static void main(String[] args) {
        Juicer.defaultMakeJuice();
    }



}
