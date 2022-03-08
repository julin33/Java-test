package oop.Demo10;

import oop.Demo9.UserService;

public class Test {
    public static void main(String[] args) {
        //没有名字初始化类，不用将实例保存在变量中
        new Apple().eat();
    }
}

class Apple{
    public void eat(){
        System.out.println("eat");
    }
}



