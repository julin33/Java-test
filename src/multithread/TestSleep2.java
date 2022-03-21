package multithread;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时
public class TestSleep2 {

    public static void main(String[] args) {
        try {
            countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //打印当前系统时间

        while (true){
            try {
                Thread.sleep(1000);
                Date startTime = new Date(System.currentTimeMillis());
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void countDown() throws InterruptedException{
        int num = 10;

        while(true) {
            Thread.sleep(1000);
            System.out.println(num--);
            if (num <= 0){
                break;
            }
        }
    }
}
