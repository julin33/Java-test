package oop.Demo1;
//值传递
public class demo3 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        demo3.change(a);
        System.out.println(a);
    }
    //返回值为空
    public static void change(int a){
        a = 10;//这里的a只是一个形参
    }
}
