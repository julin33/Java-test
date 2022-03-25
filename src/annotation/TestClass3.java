package annotation;

/**
 * 类是如何加载的 ClassLoader
 * 1. 加载到内存，会产生一个对应的Class对象
 * 2. 链接，为类变量static分配内存并设置类变量默认初始值的阶段，链接结束后 m = 0
 * 3. 初始化
 *       <clinit>(){
 *         System.out.println("A类静态代码块初始化");
 *         m = 300;
 *         m = 100;
 *       }
 */
public class TestClass3 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);

    }
}
class A {
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }

    static int m = 100;

    //静态代码块会在初始化时合并，m = 100

    public A() {
        System.out.println("A类无参构造器初始化");
    }
}