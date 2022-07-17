package jeongseok.practice.ch13;

import java.util.Scanner;

public class ThreadInterruptPractice2 {
    public static void main(String[] args) {
        ThreadExtThread thread = new ThreadExtThread();
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        thread.interrupt();
    }
}

class ThreadExtThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10 && !isInterrupted()) {
            for (int j = 0; j < 20000000; j++) {

            }
        }
        System.out.println("쓰레드가 종료 되었습니다");
    }
}