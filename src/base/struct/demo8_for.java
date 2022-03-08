package base.struct;

public class demo8_for {
    public static void main(String[] args) {
        //1-1000中能被5整除的数，每行输出三个

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
