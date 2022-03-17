package multithread;
/**
 * （并发问题）
 * 多个线程同时操作同一个对象
 * 买火车票的例子
 * 发现问题：多个线程操作同一个资源的的情况下，线程不安全，数据紊乱
 */
public class TestThread4 implements Runnable{
    //票数
    private  int ticketNums = 10;
    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "购买了第" + ticketNums-- + "张票");
        }
    }

    public static void main(String[] args) {
        TestThread4 t1 = new TestThread4();


        new Thread(t1,"傻逼").start();
        new Thread(t1,"弱智").start();
        new Thread(t1,"脑残").start();
    }
}
