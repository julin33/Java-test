package multithread;

/**
 * 静态代理模式总结：
 * 真是对象和静态对象都要实现同一个接口
 * 代理对象要代理真实角色，
 *
 * 好处：
 * 代理对象可以做很多真实对象做不了的事情
 * 真实对象专注做自己的事情
 */
public class StaticProxy {
    public static void main(String[] args) {
        You you = new You();//你要结婚

        new Thread( ()-> System.out.println("我爱你")).start();//Lambda?

        new WeddingCompany(new You()).HappyMarry();

    }
}

interface Marry {
    void HappyMarry();
}
//真是角色，你去结婚
class You implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("和傻逼结婚了");
    }
}

//代理角色，帮你去结婚
class WeddingCompany implements Marry {

    //代理谁？--》真实目标角色
    private Marry target;

    public WeddingCompany(Marry target){
        this.target = target;
    }
    @Override
    public void HappyMarry() {
        before();
        target.HappyMarry();//这就是真实对象
        after();
    }

    private void before() {
        System.out.println("结婚之前布置现场");
    }

    private void after() {
        System.out.println("结婚之后收尾款");
    }

}

