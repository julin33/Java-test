package base.operator;

public class ArithmeticOperator {
	public static void main(String[] args) {

		System.out.println(10 / 4);//���2��ȡ����
		System.out.println(10 / 4.0);//���2.5
		System.out.println(10.0 / 4);//2.5

		double d = 10 / 4;
		System.out.println(d);//���2.0

		// ȡģ
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);

		// ++��ʹ��
		int i = 10;
		i++;
		System.out.println("i = " + i);

		/* ��Ϊ���ʽʹ��
		i++: �ȸ�ֵ������
		++i: ��������ֵ*/
		int j = 8;
		int k = ++j;
		int l = j++;
		System.out.println("k = " + k);
		System.out.println("l = " + l);

	}
}
