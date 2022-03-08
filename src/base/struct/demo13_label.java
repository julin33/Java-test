package base.struct;

public class demo13_label {
    public static void main(String[] args) {
        //求101-150之间的质数
        int count = 0;
        //使用标签返回到开始，不需要掌握且不建议使用
        outer: for (int i = 101; i <= 150; i++) {
            for (int j = 2;j < i;j++){
                if (i % j == 0){
                    continue outer;
                }
            }
            System.out.println(i);
        }
    }
}
