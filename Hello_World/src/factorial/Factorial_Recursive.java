package factorial;

import java.util.Scanner;

/*
 * Title : 재귀함수를 이용한 팩토리얼 계산
 * Author : ljryul
 */

public class Factorial_Recursive {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int num;

		System.out.println("숫자를 입력하세요.");

		try {
			num = scan.nextInt();
			System.out.println(num + " 팩토리얼은 " + factorial(num) + "입니다.");
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
			scan.close();
		}
	}

	/*
	 * 5!은 5 * 4 * 3 * 2 * 1 = 5 * 4!
	 */
	public static int factorial(int num) {

		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

}
