package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        //创建集合
        List list = new ArrayList();
        //添加数字数据（自动装箱）
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("元素个数：" + list.size());
        System.out.println(list.toString());
        //删除操作
//        list.remove(0);
//        list.remove("20");//这样写会出现异常，因为括号里是index
//        强制转换Object或者Integer
//        list.remove((Object) 20);
//        list.remove((Integer) 20);

        //补充方法sublist 返回子集合

        List sublist = list.subList(1,3);//含头不含尾
        System.out.println(sublist.toString());

    }
}
