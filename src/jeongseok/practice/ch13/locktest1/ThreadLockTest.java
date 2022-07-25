package jeongseok.practice.ch13.locktest1;


class LockClass{


    void print() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("print!!");
        }
    }


    synchronized void criticalMethod() {

        try {
            System.out.println("임계영역 진입");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("임계영역1 탈출");
    }

    synchronized void criticalMethod2() {

        try {
            System.out.println("임계영역 진입");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("임계영역2 탈출");
    }

}

class ThreadEx extends Thread {

    LockClass lockClass;

    ThreadEx(LockClass lockClass) {
        this.lockClass = lockClass;
    }

    @Override
    public void run() {
        lockClass.criticalMethod();
    }
}

public class ThreadLockTest {
    public static void main(String[] args) throws InterruptedException {
        /** 의문 : 특정 스레드가 특정 객체의 락을 받아 임계영역을 수행중일때 다른 스레드는 임계영역이 아닌 영역을 그냥 접근 할 수 있는가**/

        LockClass lockClass = new LockClass();
        ThreadEx threadEx = new ThreadEx(lockClass);
        threadEx.start(); //스레드가 임계영역 진입되어 락을 쥐고 있게 됨.
        Thread.sleep(10); //확실하게 threadEx가 임계영역을 쥐고 있을만한 딜레이
        lockClass.print(); //main 스레드가 임계영역이 아닌 영역의 메소드를 호출

        /** 결론 : 락(권한)은 임계영역에서만 의미가 있는것이지 다른 영역은 어떤 스레드든 막 접근 할 수 있다. **/
   }
}
