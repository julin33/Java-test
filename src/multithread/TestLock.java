package multithread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试Lock锁
 */
public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();

    }
}

class TestLock2 implements Runnable{
    private int ticketNums = 10;

    //定义Lock锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        while(true){
            try {
                lock.lock(); //加锁 一般放在try里
                if (ticketNums > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "取了第"
                            + ticketNums-- + "张票");
                } else {
                    break;
                }

            } finally {
                lock.unlock();//解锁 一般放在finally里
                try {
                    Thread.sleep(100); //防止全被一个线程抢了
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}