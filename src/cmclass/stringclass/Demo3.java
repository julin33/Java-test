package cmclass.stringclass;

//StringBuffer StringBuilder 可变长字符串

public class Demo3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        //1. append() 追加
        sb.append("java世界第一");
        System.out.println(sb.toString());
        sb.append("就这就这？");
        System.out.println(sb.toString());
        sb.append("我们还行吧");
        System.out.println(sb.toString());
        //2. insert() 添加
        sb.insert(0,"我在最前面");
        System.out.println(sb.toString());
        //3. replace() 替换
        sb.replace(0,5,"Hello");//含头不含尾
        System.out.println(sb.toString());
        //4. delete() 删除
        sb.delete(0,5);
        System.out.println(sb.toString());
    }
}
