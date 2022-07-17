package jeongseok.ex.ch13;

public class ThreadEx1 {
    public static void main(String[] args) {
        //쓰레드를 쓰레드 클래스를 상속받아 생성
        ThreadClassEx t1 = new ThreadClassEx();


        //쓰레드를 Runnable 인터페이스를 구현하여 생성
        Runnable runnable = new ThreadInterfaceEx();
        Thread t2 = new Thread(runnable);


        t1.start();
        t2.start();
        System.out.println("메인 끝");
    }

}

class ThreadClassEx extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 50000000; i++) {
                System.out.println(this.getClass().getName() + " : "+i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

class ThreadInterfaceEx implements Runnable {

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 50000000; i++) {
                System.out.println(this.getClass().getName() + " : "+i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}