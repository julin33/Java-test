package base.operator;

public class ArithmeticOperatorExercise01 {
	
	public static void main(String[] args) {
		// ������1
		int i = 1;
		i = i++; //����ʹ����ʱ���� ��1��temp=i;(2)i=i+1;(3)i=temp
		System.out.println(i);// i=1

		// ������2
		i = 1;
		i = ++i; //����ʹ����ʱ���� ��1��i=i+1;(2)temp=i;(3)i=temp
		System.out.println(i);// i=2

		int i1 = 10;
		int i2 = 20;
		i = i1++;
		System.out.println("i=" + i);
		System.out.println("i2=" + i2);
		i = --i2;
		System.out.println("i=" + i);
		System.out.println("i2=" + i2);

	}
	
}