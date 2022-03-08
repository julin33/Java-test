package base.struct;

public class demo14_test {
    public static void main(String[] args) {
        //打印三角形 5行
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //可以使用debug功能看运行步骤
    }
}
