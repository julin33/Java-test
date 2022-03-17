package commonclass.packageclass;

public class Demo1 {
    public static void main(String[] args) {
//        int num = 10;
        //类型转换：装箱，基本类型转换成引用类型
        //基本类型
        int num1 = 18;
        //使用Integer类创建对象
        Integer integer1 = new Integer(num1); //该构造器jdk9就被弃用了
        Integer integer2 = Integer.valueOf(num1);

        //类型转换：拆箱，引用类型转成基本类型
        Integer integer3 = new Integer(100);
        int num2 = integer3.intValue();
        System.out.println(num2);

        //JDK1.5后，提供了自动装箱和拆箱
        int age1 = 30;
        //自动装箱
        Integer integer4 = age1;
        System.out.println("自动装箱");
        System.out.println(integer4);
        //自动拆箱
        int age2 = integer4;
        System.out.println("自动拆箱");
        System.out.println(age2);

        //基本类型和字符串之间的转换
        //1、基本类型转成字符串
        int n1 = 100;
        //1.1 使用+号
        String s1 = "" + n1;
        //1.2 使用Integer中的toString方法
        String s2 = Integer.toString(n1,16);
        System.out.println(s1);
        System.out.println(s2);

        //2. 字符串转成基本类型
        String str = "150";
        //使用Integer.parseXXX();
        int n2 = Integer.parseInt(str);
        System.out.println(n2);

        //boolean字符串转成红基本类型，“true”--->true
        // 非"true"----->false
        String str2 = "false";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }
}
