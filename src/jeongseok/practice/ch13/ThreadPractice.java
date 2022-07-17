package jeongseok.practice.ch13;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new thClass());
        thread.join(5000);
        thread.start();
    }
}

class thClass implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);

                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}