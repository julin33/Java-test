package base.struct;

public class demo12_continue {
    public static void main(String[] args) {
        //continue语句用在循环语句中，用于终止某次循环过程
        // 即跳过循环体中尚未执行的语句，接着进行下一次是否执行循环的判定
        int i = 0;
        while (i < 100){
            i ++;
            if (i % 10 == 0){
                System.out.println();
                continue;//停止执行循环后面的语句跳到循环的开始重新执行
            }
            System.out.println(i);
        }
    }
}
