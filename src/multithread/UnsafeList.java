package multithread;

import java.util.ArrayList;

/**
 * 线程不安全的集合
 * 可能会出现两个线程同一时间向同一位置添加元素，就会出现数量减少
 */
public class UnsafeList {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread( ()-> list.add(Thread.currentThread().getName())).start();
        }
        Thread.sleep(3000);
        System.out.println(list.size());
    }
}
