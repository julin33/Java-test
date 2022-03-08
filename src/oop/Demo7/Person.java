package oop.Demo7;

public class Person {
    {
        System.out.println("匿名代码块");//第二个执行
    }
    static {
        System.out.println("静态代码块");//第一个执行,只执行一次
    }
    public Person(){
        System.out.println("构造方法");//第三个执行
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("===================");
        Person person2 = new Person();



    }
}
