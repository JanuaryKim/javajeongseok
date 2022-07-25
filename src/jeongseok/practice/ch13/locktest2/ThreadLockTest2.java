package jeongseok.practice.ch13.locktest2;


class LockClass{


    void print() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("print!!");
        }
    }


    synchronized void criticalMethod1() { //임계영역 1

        try {
            System.out.println("임계영역1 진입");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("임계영역1 탈출");
    }

    synchronized void criticalMethod2() {  //임계영역 2

        try {
            System.out.println("임계영역2 진입");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("임계영역2 탈출");
    }

}

class ThreadEx1 extends Thread {

    LockClass lockClass;

    ThreadEx1(LockClass lockClass) {
        this.lockClass = lockClass;
    }

    @Override
    public void run() {
        lockClass.criticalMethod1();
    }
}

class ThreadEx2 extends Thread {

    LockClass lockClass;

    ThreadEx2(LockClass lockClass) {
        this.lockClass = lockClass;
    }

    @Override
    public void run() {
        lockClass.criticalMethod2();
    }
}



public class ThreadLockTest2 {
    public static void main(String[] args) throws InterruptedException {
        /** 의문 : 이미 어떤 스레드가 객체의 락을 받아 임계영역 처리 중일때 다른 스레드가 또 그 객체의 다른 임계영역의 처리가 가능한가 **/

        LockClass lockClass = new LockClass();
        ThreadEx1 threadEx1 = new ThreadEx1(lockClass);
        ThreadEx2 threadEx2 = new ThreadEx2(lockClass);
        threadEx1.start();
        threadEx2.start();

        Thread.sleep(10);
//        lockClass.print(); //main 스레드가 임계영역이 아닌 영역의 메소드를 호출

        /** 결론 : 불가능하다. 락이란것은 객체당 하나이기 때문에 어떤 임계영역에 진입하던지 객체락(1개)을 받고 들어가야한다 **/
   }
}
