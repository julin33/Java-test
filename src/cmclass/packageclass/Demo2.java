package cmclass.packageclass;

public class Demo2 {
    public static void main(String[] args) {
        //面试题
        int n1 = 100;
        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer1 == integer2);//false

        Integer integer3 = 100;//自动装箱
        Integer integer4 = 100;
        System.out.println(integer3 == integer4);//true

        Integer integer5 = 200;
        Integer integer6 = 200;
        System.out.println(integer5 == integer6);//false
        //查看Integer.valueOf源码

    }
}
