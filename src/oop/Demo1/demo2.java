package oop.Demo1;

public class demo2 {
    public static void main(String[] args) {
        //静态方法 static
        //非静态方法

        //实例化这个类new
        //对象类型 对象名 = 对象值
        student student = new student();
        student.say();
    }

    //和类一起加载的
    public static void a(){
//        b();//调用的b还不存在
    }

    //类实例化之后才存在,new了之后才存在
    public void b(){
        a();
    }

}
