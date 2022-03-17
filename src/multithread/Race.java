package multithread;

/**
 * 模拟龟兔赛跑
 */
public class Race implements Runnable{
    //胜利者 因为只有一个所以是静态
    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (winner != null) {
                break;
            }
            if (Thread.currentThread().getName().equals("兔子") && i == 50) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
        if (winner == null) {
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + winner);
        }
    }

    //判断是否完成比赛
    private boolean gameOver(int steps) {
        //判断是否有胜利者
        if (winner != null) {
            return true;
        } {
            if (steps >= 100) {

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }

}
