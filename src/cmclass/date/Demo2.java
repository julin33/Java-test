package cmclass.date;

//Calendar

import java.util.Calendar;

public class Demo2 {
    public static void main(String[] args) {
        //1. 创建Calendar对象
        Calendar calendar = Calendar.getInstance();//构造方法受保护不能直接使用
        System.out.println(calendar.getTime().toLocaleString());
        System.out.println(calendar.getTimeInMillis());
        //2. 获取时间信息
        //获取年
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH);//注 从0-11
        int day = calendar.get(calendar.DAY_OF_MONTH);
        int hour = calendar.get(calendar.HOUR_OF_DAY);
        //HOUR 12小时 HOUR_OF_DAY 24小时
        int minute = calendar.get(calendar.MINUTE);
        int second = calendar.get(calendar.SECOND);

        System.out.println(year + "年" + (month+1) + "月" + day + "日"
        + hour + "时" + minute + "分" + second + "秒" );

        //3. 修改时间
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.DAY_OF_MONTH,5);
        System.out.println(calendar2.getTime().toLocaleString());

        //4. add方法修改时间
        calendar2.add(Calendar.HOUR,1);//加一个小时
        System.out.println(calendar2.getTime().toLocaleString());

        //5. 补充方法
        int max = calendar2.getActualMaximum(Calendar.DAY_OF_MONTH);
        int min = calendar2.getActualMinimum(Calendar.DAY_OF_MONTH);
        System.out.println(max);
        System.out.println(min);
    }
}
