package oop.Demo9;

//interface 定义的关键字 ，接口都需要有实现类
public interface UserService {
    //接口中的所有定义其实都是抽象的public abstract

    //常量 public static final
    int AGE = 99;

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}

/*
作用：
    1、约束
    2、定义一些方法让不同的人实现
    3、所有的方法都是public abstract
    4、所有的常量都是public static final
    5、接口不能被实例化，接口中没有构造方法
    6、implements可以实现多个接口
    7、必须要重写接口中的方法
 */
