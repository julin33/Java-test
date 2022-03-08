package base.struct;


public class demo11_break {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100){
            i++;
            System.out.println(i);
            if (i == 30){
                break; //强制退出循环
            }
        }
    }

}
