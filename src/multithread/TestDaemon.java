package multithread;

/**
 * 测试守护线程  gc就是一种守护线程
 */
public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        Laji laji = new Laji();

        Thread thread = new Thread(god);
        thread.setDaemon(true); //默认是False表示用户线程

        thread.start();//上帝守护线程启动

        new Thread(laji).start();//用户线程启动


    }
}
class God implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("上帝保佑着你");
        }
    }
}

class Laji implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你的一生都开心的活着");
        }
        System.out.println("=======Goodbye hello world！========");
    }
}
