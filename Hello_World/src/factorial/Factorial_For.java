package factorial;

import java.util.Scanner;

/*
 * Title : For문을 이용한 팩토리얼 계산
 * Author : ljryul
 */

public class Factorial_For {

	static public Scanner scan = new Scanner(System.in);

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

	public static int factorial(int num) {
		
		int sum = 1;

		for (int i = 2; i <= num; i++) {
			sum *= i;
		}

		return sum;
	}

}
