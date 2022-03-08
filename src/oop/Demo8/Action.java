package oop.Demo8;
//abstract 抽象类
public abstract class Action {
    //约束~ 有人帮我们实现
    //abstract 抽象方法，只有方法名字，没有方法实现
    public abstract void doSomething();
    public Action(){}

}

/*
1、 不能new这个抽象类，只能靠子类实现他
2、 抽象类中可以写普通方法
3、 抽象方法把必须在抽象类中
抽象的抽象：约束~

思考：new存在构造器吗
存在的意义？
 */