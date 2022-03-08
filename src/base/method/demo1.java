package base.method;

public class  demo1 {
    //main方法
    public static void main(String[] args) {
        //实际参数：实际调用传递给它的参数
        int sum = add(1,2);
        System.out.println(sum);
//        test();
    }
    //加法
    //形式参数，起定义作用
    public static int add(int a,int b){
        return a + b;
    }

    public static void test(){
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                //注意这里是print,println输出完会换行
            }
            if (i %(5*3) == 0){
                System.out.println();
                //System.out.print("/n");
            }
        }
    }
}
