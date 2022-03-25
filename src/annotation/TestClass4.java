package annotation;

/**
 * 测试类什么时候会被初始化
 */
public class TestClass4 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用 一定会产生类的初始化
        //Son son = new Son();

        //反射也会产生主动引用
        //Class.forName("annotation.Son");

        //2.被动引用 不会产生初始化
//        System.out.println(Son.b); //子类引用父类的静态变量，不会导致子类的初始化

//        Son[] arr = new Son[10]; //通过数组定义类引用，不会触发此类的初始化

//        System.out.println(Son.M); //引用常量不会触发此类的初始化 （常量在链接阶段就存入常量池当中了）

    }
}
class Father {
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father {

    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;
}