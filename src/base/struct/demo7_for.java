package base.struct;

public class demo7_for {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0) {
                oddSum += i;
            }
            else {
                evenSum += i;
            }

        }
        System.out.println("奇数和为" + oddSum + "偶数和为" + evenSum);
    }
}
