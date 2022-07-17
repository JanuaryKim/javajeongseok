package jeongseok.ex.ch13.ThreadWaitEx_sub.add_Wait_Notify;

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
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            String name = Thread.currentThread().getName();
            table.remove(food);
            System.out.println(name + " ate a " + food);

        }
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

        while(dishes.size() >= MAX_FOOD) { //음식이 꽉 채워져 있을 동안 반복
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting ");

            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

        }
        dishes.add(dish); //테이블에 빈공간이 있을때 추가
        notify(); //add 처리가 끝났으므로 잠들어 있는 손님 쓰레드를 깨움
        System.out.println("Dishes: " + dishes.toString());
    }

    public void remove(String dishName) {

        synchronized (this) { //해당 부분을 동기화

            String name = Thread.currentThread().getName();

            while (dishes.size() == 0) {

                System.out.println(name + " is waiting.");

                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }


            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();
                        return;
                    }
                }

                try {
                    System.out.println(name + " is waiting");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }



    }

    public int dishNum(){return dishNames.length;}
}