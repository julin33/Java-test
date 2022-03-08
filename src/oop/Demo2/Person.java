package oop.Demo2;

public class Person {
    //一个类即使什么都不写，它也会存在一个方法，即构造方法
    String name;
    int age;

    //显式定义的构造器
    //实例化初始值
    //1.使用new关键字，本质是在调用构造器
    //2.构造器一般用用初始化值
    public Person(){
    }
    //有参构造,一旦定义了有参构造，无参构造就必须要显示定义

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //alt+insert生成构造器,可用于重载
}

/*
    public static void main(String[] args) {
        //实例化了一个对象
        Person person = new Person("julin");
        System.out.println(person.name);//julin
    }
 */