package collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map就扣的使用
 * 特点：1、存储键值对 2、键不能重复，值可以重复 3、无序
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //1.添加元素
        map.put("cn","中国");
        map.put("uk","英国");
        map.put("usa","美国");

        System.out.println("元素的个数："+map.size());
        System.out.println(map.toString());

        //2. 删除
//        map.remove("usa");
//        System.out.println(map.size());

        //3. 遍历
        System.out.println("------keySet------");
        //使用keySet
//        Set<String> keySet = map.keySet();
        for (String key :map.keySet()) {
            System.out.println(key+"------"+map.get(key));//通过key获取value
        }
        System.out.println("-------entrySet-------");
        //使用entrySet 一种映射对
//        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "------" + entry.getValue());
//            System.out.println(entry);
        }
        //判断
        System.out.println(map.containsKey("cn"));
        System.out.println(map.containsValue("美国"));
    }
}
