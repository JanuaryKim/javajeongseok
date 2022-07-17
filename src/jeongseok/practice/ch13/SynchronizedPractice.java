package jeongseok.practice.ch13;

public class SynchronizedPractice {

    int money = 1000;

    public static void main(String[] args) {
        SynchronizedPractice s = new SynchronizedPractice();
        ThreadEx3_1 thread1 = new ThreadEx3_1(s);
        ThreadEx3_1 thread2 = new ThreadEx3_1(s);
        thread1.start();
        thread2.start();
    }
}

class ThreadEx3_1 extends Thread {
    SynchronizedPractice s;
    public ThreadEx3_1(SynchronizedPractice s) {
        this.s = s;
    }

    @Override
    public void run() {

        while (s.money > 0) {

            int withDrawMoney = (int)(Math.random() * 2 + 1) * 100;

            synchronized (s){  //공유하는 참조변수를 괄호안에 써준다.
                if(s.money >= withDrawMoney)
                {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    s.money -= withDrawMoney;

                }

            }

            System.out.println(getName()+ " - 잔액 : "+ s.money);
        }


    }
}