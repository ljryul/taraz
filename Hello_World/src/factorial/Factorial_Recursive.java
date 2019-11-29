package factorial;

import java.util.Scanner;

public class Factorial_Recursive {

	public static Scanner scan = new Scanner(System.in);

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

		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

}
