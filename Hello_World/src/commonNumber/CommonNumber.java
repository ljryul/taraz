package commonNumber;

import java.util.Scanner;

public class CommonNumber {

	static public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int max, min, num1, num2, act;

		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		num1 = scan.nextInt();

		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		num2 = scan.nextInt();

		if (num1 == num2) {
			System.out.println("���� �ٸ� ���ڸ� �Է��ϼ���.");
			return;
		}

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		System.out.println("������ �۾��� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. �ִ�����	2. �ּҰ����	3. ����");
		act = scan.nextInt();

		if (act == 1) {
			int result = CommonMax(max, min);
			System.out.println("�ִ������� " + result + " �Դϴ�.");
		} else if (act == 2) {
			int result = CommonMin(max, min);
			System.out.println("�ּҰ������ " + result + " �Դϴ�.");
		} else if (act == 3) {
			System.out.println("���α׷��� �����մϴ�.");
			scan.close();
			return;
		}

	}

	private static int CommonMin(int max, int min) {
		
		int result = max * min / CommonMax(max, min);
		return result;
	}

	private static int CommonMax(int max, int min) {
		
		int i, result = 1;
		
		for (i = 1; i < min + 1; i++) {
			if (max % i == 0 && min % i == 0) {
				if (i > result) {
					result = i;
				}
			}
		}
		return result;
	}
}
