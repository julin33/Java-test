package multithread;

/**
 * 不安全的买票
 * 线程不安全，有负数
 */
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();

        new Thread(station,"苦逼的我").start();
        new Thread(station,"牛逼的你们").start();
        new Thread(station,"可恶的黄牛").start();
    }
}

class BuyTicket implements Runnable{

    //票
    private int ticketNums = 10;
    boolean flag = true;//外部停止方式

    //买票
    @Override
    public void run() {
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void buy() throws InterruptedException {
        //判断是否有票
        if (ticketNums <= 0) {
            flag = false;
            return;
        }
        //模拟延时
        Thread.sleep(100);
        //买票
        System.out.println(Thread.currentThread().getName() + "拿到第" + ticketNums-- + "张票");

    }


}
