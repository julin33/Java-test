package multithread;

/**
 * 不安全的取钱
 *
 */
public class UnsafeBank {
    public static void main(String[] args) {
        Account account = new Account(100,"私房钱");

        Drawing you = new Drawing(account,50,"你");
        Drawing girlFriend = new Drawing(account,100,"女朋友");

        you.start();
        girlFriend.start();


    }
}

//账户
class Account {
    int money;
    String name;

    public Account(int money,String name) {
        this.name = name;
        this.money = money;
    }
}

//银行：模拟取款
class Drawing extends Thread {

    Account account;
    //取了多少钱
    int drawingMoney;
    //现在手里有多少钱
    int nowMoney;

    public Drawing(Account account,int drawingMoney,String name) {
        super(name);//只能在第一行
        this.account = account;
        this.drawingMoney = drawingMoney;

    }

    //取钱
    @Override
    public void run() {
        //判断有没有钱
        if (account.money - drawingMoney < 0) {
            System.out.println(Thread.currentThread().getName() + "取不了钱");
            return;
        }
        //延时放大问题
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //卡里的余额 = 余额 - 你取的钱
        account.money = account.money - drawingMoney;
        //你手里的钱
        nowMoney = nowMoney + drawingMoney;

        System.out.println(account.name + "余额为" + account.money);
        //this.getName()等价于Thread.currentThread().getName()
        System.out.println(this.getName() + "手里的钱：" + nowMoney);


    }
}