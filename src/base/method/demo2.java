package base.method;

public class demo2 {
    public static void main(String[] args) {
        double max = max (10.0,20.0);
//        int max = max (10,20);
        System.out.println(max);
    }
    //比大小
    public static int max(int num1,int num2){
        int result = 0;
        if (num1 > num2){
            result = num1;
        }
        else if (num2 > num1){
            result = num2;
        }
        else {
            System.out.println("num1 == num2");
            return 0;//终止方法
        }
        return result;
    }

    //重载方法
    public static double max(double num1,double num2){
        double result = 0;
        if (num1 > num2){
            result = num1;
        }
        else if (num2 > num1){
            result = num2;
        }
        else {
            System.out.println("num1 == num2");
            return 0;//终止方法
        }
        return result;
    }
}
