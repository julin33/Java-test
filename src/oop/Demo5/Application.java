package oop.Demo5;

public class Application {
    public static void main(String[] args) {

        //静态方法和非静态方法的区别很大
        //静态方法只调用左边，定义的数据类型有关
        //非静态：重写

        A a = new A();
        a.test();

        //父类的引用指向了子类
        B b = new A();//非静态：子类重写了父类的方法
        b.test();



    }
}
