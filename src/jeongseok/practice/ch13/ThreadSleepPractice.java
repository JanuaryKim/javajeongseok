package jeongseok.practice.ch13;

public class ThreadSleepPractice {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();

//        thread1.sleep(2000); //.으로 접급하는 참조변수와 상관없이 sleep()을 호출하는 쓰레드를 sleep시킴!! .그러므로 main쓰레드가 sleep!!

    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            this.sleep(2000); //Thread1 쓰레드를 sleep시킴!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 200; i++) {
            System.out.printf("-");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.printf("|");
        }
    }
}