package multithread;

/**
 * lambda简化形式
 */
public class TestLambda2 {
    public static void main(String[] args) {
        //带参数的lambda表达式
       /* ILove love = (int a)->{
       System.out.println("I love you" + a)
       };
        */
        //更加简化的lambda,去掉参数类型，去掉小括号，去掉大括号（前提是一行代码）
        //多个参数也可以去掉参数类型，要去掉就都去掉，必须要机上括号
//        ILove love = a-> System.out.println("I love you -->" + a);
        ILove love = (a,b)-> {
            System.out.println("I love you --" + a);
            System.out.println("I love you --" + b);
        };
        love.love(520,521);

    }

}

interface ILove{
    void love(int a,int b);
}

class Love implements ILove{
    @Override
    public void love(int a,int b) {
        System.out.println("I love you -->" + a);
    }
}