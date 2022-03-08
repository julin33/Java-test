package cmclass.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Demo3 {
    public static void main(String[] args) throws Exception{
        //1. 创建SimpleDateFormat对象 y年 M月
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日" +
                "HH:mm:ss");
        //2. 创建Date
        Date date = new Date();
        //格式化Date(把日期转成字符串)
        String str = sdf.format(date);
        System.out.println(str);
        //解析 （把字符串转成日期）

        Date date2 = sdf.parse("1998年03月14日10:22:00");
        //有个异常先抛掉
        System.out.println(date2.toLocaleString());
    }
}
