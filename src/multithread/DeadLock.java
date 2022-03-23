package multithread;

/**
 * 死锁就是多给线程互相抱着对方需要的资源，然后形成僵持
 */
public class DeadLock {
    public static void main(String[] args) {
        Makeup girl1 = new Makeup(0, "精神小妹");
        Makeup girl2 = new Makeup(1, "泼妇");

        girl1.start();
        girl2.start();

    }
}

class Lipstick{

}
class Mirror{

}

class Makeup extends Thread{
    //因为是唯一的 所以使用static
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;//选择
    String name;//使用化妆品的人

    public Makeup(int choice, String name) {
        this.name = name;
        this.choice = choice;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //化妆：互相持有对方的锁，就是需要那倒对方的资源
    private void makeup() throws InterruptedException {
        if (choice == 0) {
            synchronized (lipstick) { //注意这里是嵌套，只要将里面的内容放在外面就解决了死锁问题
                System.out.println(this.name + "获得口红的锁");

                Thread.sleep(1000);

                synchronized (mirror) {
                    System.out.println(this.name + "获得镜子的锁");
                }
            }
        }else {
                synchronized (mirror) {
                    System.out.println(this.name + "获得镜子的锁");

                    Thread.sleep(2000);

                    synchronized (lipstick) {
                        System.out.println(this.name + "获得口红的锁");
                    }

                }


        }

    }
}