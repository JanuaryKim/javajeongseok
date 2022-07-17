package jeongseok.ex.ch13.ThreadWaitEx_sub;

import java.util.ArrayList;

public class ThreadWaitEx1 {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table,"donut"), "CUST1").start();
        new Thread(new Customer(table,"burger"), "CUST2").start();
//        new Thread(new Customer(table,"donut"), "CUST3").start();
//        new Thread(new Customer(table,"donut"), "CUST4").start();

        Thread.sleep(5000);
        System.exit(0); //프로그램(프로세스) 자체를 끝내버림 (모든 쓰레드 종료)
    }
}


class Customer implements Runnable {
    private Table table;
    private String food;

    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }
            String name = Thread.currentThread().getName();
            if (eatFood()) {
                System.out.println(name + " ate a " + food);
            } else {
                System.out.println(name + " failed to eat. :(");
            }
        }
    }

    boolean eatFood() {
        return table.remove(food);
    }
}

class Cook implements Runnable {

    private Table table;

    public Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {

            int idx = (int) (Math.random() * table.dishNum());

            table.add(table.dishNames[idx]);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
    }
}


class Table{
    String[] dishNames = {"donut","donut", "burger"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();


    public synchronized void add(String dish) { //해당 메소드 자체를 동기화

        if (dishes.size() >= MAX_FOOD) {
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes: " + dishes.toString());
    }

    public boolean remove(String dishName) {

        synchronized (this) { //해당 부분을 동기화

            while (dishes.size() == 0) { //갯수가 0개일때 이 구문에 들어오면 dish가 추가 안되고 계속 기다림..
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting.");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }

            for (int i = 0; i < dishes.size(); i++) {
                if (dishName.equals(dishes.get(i))) {

                    dishes.remove(i);
                    return true;
                }
            }
        }


        return false;
    }

    public int dishNum(){return dishNames.length;}
}