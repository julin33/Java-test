package cmclass.date;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        //1. 创建Date对象
        //今天
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.toLocaleString());
        //昨天
        Date date2 = new Date(date1.getTime() - 60*60*24*1000);
        System.out.println(date2.toLocaleString());
        //2. 方法after before
        boolean b1 = date1.after(date2);
        System.out.println(b1);
        boolean b2 = date1.before(date2);
        System.out.println(b2);
        //3. compareTo() 比较
        int d = date1.compareTo(date2);
        System.out.println(d);//通过正负判断时间早晚
        //可以用equals比较是否相等


    }
}
