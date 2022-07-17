package jeongseok.practice.ch13;

import java.util.Scanner;

public class ThreadInterruptPractice {
    public static void main(String[] args) {
        ThreadEx1 threadEx1 = new ThreadEx1();
        threadEx1.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); //무언가 입력을 받으면
        threadEx1.interrupt(); //sleep 되어 있는 threadEx1 쓰레드를 인터럽트 시킴
    }
}

class ThreadEx1 extends Thread {
    @Override
    public void run() {
        System.out.println("쓰레드 시작");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("쓰레드 종료");
    }
}