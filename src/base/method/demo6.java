package base.method;

public class demo6 {
    //2！ 2*1
    //3！ 3*2*1
    //利用递归实现阶乘
    public static void main(String[] args) {
        System.out.println(f(-5));
    }

    //递归
    public static int f(int n){
        if (n == 1){
            return 1;
        }
        else if(n <= 0){
            return 0;
        }
        else {
            return n * f(n-1);
        }
    }
}
