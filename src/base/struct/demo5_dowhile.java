package base.struct;

public class demo5_dowhile {
    public static void main(String[] args) {
        //do while即使不满足条件循环也会至少执行一次
        int i = 0;
        int sum = 0;
        do {
            i++;
            sum += i;
        }while (i < 100);
        System.out.println(sum);
    }
    //while先判断后执行 do while先执行后判断
}
