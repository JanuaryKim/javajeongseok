package jeongseok.ex.ch13;

public class ThreadEx19 {
    public static void main(String[] args) throws InterruptedException {
        ThreadEx19_1 thread1 = new ThreadEx19_1();
        thread1.start();

        thread1.join(); //thread1 쓰레드를 참가시켜서 main쓰레드는 기다리게 됨. 그래서 main 쓰레드는 thread1의 처리가다 끝난 후에 처리 됨.
        System.out.println("메인 쓰레드 종료");
    }
}

class ThreadEx19_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




