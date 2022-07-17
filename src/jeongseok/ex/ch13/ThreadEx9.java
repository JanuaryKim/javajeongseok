package jeongseok.ex.ch13;

public class ThreadEx9 {
    public static void main(String[] args) {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup thGrp1 = new ThreadGroup("grp1");
        ThreadGroup thGrp2 = new ThreadGroup("grp2");

        ThreadGroup subThGrp = new ThreadGroup(thGrp1,"subGrp");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thGrp1.setMaxPriority(3);


        new Thread(thGrp1,r, "th1").start();
        new Thread(subThGrp,r, "subTh").start();
        new Thread(thGrp2,r, "th2").start();


        System.out.println("main.activeCount : "+ main.activeCount()); //현재 작동중인 쓰레드 갯수 (main에서 구했으므로, main 포함)
        System.out.println("main.activeGroupCount : "+ main.activeGroupCount()); //그룹에서는 자신을 제외하고 하위 그룹만 출력 (main 그룹 제외)

        main.list();
    }
}
