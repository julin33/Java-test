package commonclass.stringclass;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        String name = "hello";//"hello"常量存储在字符串池中
        name = "zhangsan";//“zhangsan”赋值给name
        // （没有修改hello，而是在字符串池中重新开辟空间，然后name只向"zhangsan"）
        String name2 = "zhangsan";//name2的地址也指向zhangsan，实现字符串常量的共享

        //演示字符串的另一种创建方式 new String
        String str1 = new String("java是世界上最好的语言");
        String str2 = new String("java是世界上最好的语言");
        //str指向堆里面的对象（会浪费空间，常量池里也会创建对象）
        System.out.println(str1 == str2);

        System.out.println("-------------字符串方法使用1--------------");

        //字符串方法的使用
        //1. length() 返回字符串的长度
        //2. charAt(int index) 返回某个位置的字符
        //3. contains(String str) 判断是否包含某个字符串

        String content = "捏麻麻滴";
        System.out.println(content.length());
        System.out.println(content.charAt(content.length()-1));
        System.out.println(content.contains("麻麻"));
        System.out.println(content.contains("超市你"));

        System.out.println("-------------字符串方法使用2--------------");

        //4. toCharArray() 返回字符串对应的数组
        //5. indexOf() 返回字符串首次出现的位置
        //6. lastIndexOf() 返回字符串最后一次出现的位置
        System.out.println(Arrays.toString(content.toCharArray()));
        System.out.println(content.indexOf("麻"));
        System.out.println(content.indexOf("麻",2));
        //从某个脚标开始找
        System.out.println(content.lastIndexOf("麻"));

        System.out.println("-------------字符串方法使用3--------------");

        //7. trim() 去掉字符串前后的空格
        //8. toUpperCase() 把小写转换成大写 toLowerCase() 把大写转成小写
        //9. endWith() 判断是否以str结尾； startWith(str) 判断是否以str开头

        String content2 = "    Hello World   ";
        System.out.println(content2.trim());
        System.out.println(content2.toUpperCase());
        System.out.println(content2.toLowerCase());
        String filename = "hello.java";
        System.out.println(filename.endsWith(".java"));
        System.out.println(filename.startsWith("hello"));

        System.out.println("-------------字符串方法使用4--------------");

        //10. replace(char old,char new) 用心的字符或者在字符串替换旧的字符或字符串
        //11. split()对字符串拆分

        System.out.println(content.replace("捏", "你"));

        String say = "java is the best programing    language,ass we can";
        String[] arr = say.split("[ ,]+");
        System.out.println(arr.length);
        for (String string : arr) {
            System.out.println(string);
        }
        //补充方法 equals , compareTo() 比较大小

        System.out.println("-------------字符串方法使用5--------------");

        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写的比较

        String s3 = "abc";//a--97
        String s4 = "xyz";//x--120
        System.out.println(s3.compareTo(s4));//位置相减=-23

        String s5 = "abc";
        String s6 = "abcxyz";
        System.out.println(s5.compareTo(s6));//长度相减
    }

}
