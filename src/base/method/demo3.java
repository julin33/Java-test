package base.method;

public class demo3 {
    //命令行传参，去src下的cmd里执行
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
