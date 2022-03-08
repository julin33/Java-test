package collection.list;
/**
 * Vector的使用
 */

import java.util.Enumeration;
import java.util.Vector;

public class Demo6 {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add("西瓜");
        vector.add("葡萄");
        vector.add("苹果");
        System.out.println("元素个数："+vector.size());
        System.out.println(vector.toString());

//        vector.remove("西瓜");
//        vector.remove(1);

        //遍历
        //使用枚举器
        Enumeration en = vector.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

        System.out.println(vector.contains("西瓜"));
        System.out.println(vector.isEmpty());

        //其他方法
        //firstElement lastElement ElementAt()
    }
}
