package oop.Demo7;

import static java.lang.Math.random; //静态导入包
import static java.lang.Math.PI;

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.random());//如果想要省略Math前缀
        System.out.println(random());
        System.out.println(PI);
    }
}
