package base.operator;

public class sanyuan {
    public static void main(String[] args) {
//        如果x == ture,结果为y,否则为z
//        x ? y : z
        int score = 80;
        String type = score < 60 ? "不及格" : "及格";
        System.out.printf(type);

    }
}
