package base.method;

public class demo5 {
    public static void main(String[] args) {
        demo5 test = new demo5();
        test.test();
    }
    public void test(){
        test();
    }//内存溢出
}
