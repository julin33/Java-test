package multithread;

/**
 * 测试生产者消费者问题2：信号灯法，标志为解决
 */
public class TestPC2 {
    public static void main(String[] args) {
        TV tv = new TV();

        new Actor(tv).start();
        new Audience(tv).start();
    }

}

//生产者：演员
class Actor extends Thread {
    TV tv;

    public Actor (TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i%2 == 0) {
                this.tv.play("快乐大本营播放中");
            } else {
                this.tv.play("守护最美好的批里批里");
            }
        }
    }
}

//消费者：观众
class Audience extends Thread {
    TV tv;

    public Audience (TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.tv.watch();
        }
    }
}

//产品：节目
class TV {
    //演员表演，观众等待 T
    //观众观看，演员等待 F
    String voice;//表演的节目
    boolean flag = true;

    //表演
    public synchronized void play(String voice) {
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员表演了" + voice);

        //通知观众观看
        this.notifyAll();
        this.voice = voice;

        this.flag = !this.flag;
    }

    //观看

    public synchronized void watch() {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观看了：" + voice);
        //通知演员表演
        this.notifyAll();
        this.flag = !this.flag;

    }

}