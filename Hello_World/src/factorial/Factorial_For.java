package factorial;

import java.util.Scanner;

public class Factorial_For {

	static public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int num;

		System.out.println("���ڸ� �Է��ϼ���.");
		try {
			num = scan.nextInt();
			System.out.println(num + " ���丮���� " + factorial(num) + "�Դϴ�.");
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���");
			scan.close();
		}

	}

	public static int factorial(int num) {
		int sum = 1;

		for (int i = 2; i <= num; i++) {
			sum *= i;
		}

		return sum;
	}

}
