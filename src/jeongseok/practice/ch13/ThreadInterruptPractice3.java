package jeongseok.practice.ch13;

import java.util.Scanner;

public class ThreadInterruptPractice3 {
    public static void main(String[] args) {
        ThreadExtThread2 thread = new ThreadExtThread2();
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        thread.interrupt();
    }
}

class ThreadExtThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10 && !isInterrupted()) {
            try {
                Thread.sleep(4000); //sleep일때 interrupt 하면 exception 발생과 함께 현재 쓰레드의 interrupted 상태를 false로 초기화 시킨다
                System.out.println(i++); //그러므로 해당 출력문은 interrupt 시켜도 계속 실행된다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("쓰레드가 종료 되었습니다");
    }
}