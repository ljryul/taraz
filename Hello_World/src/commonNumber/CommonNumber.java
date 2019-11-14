package commonNumber;

import java.util.Scanner;

public class CommonNumber {

	static public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int max, min, num1, num2, act;

		System.out.println("첫번째 숫자를 입력하세요.");
		num1 = scan.nextInt();

		System.out.println("두번째 숫자를 입력하세요.");
		num2 = scan.nextInt();

		if (num1 == num2) {
			System.out.println("서로 다른 숫자를 입력하세요.");
			return;
		}

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		System.out.println("수행할 작업의 번호를 입력하세요.");
		System.out.println("1. 최대공약수	2. 최소공배수	3. 종료");
		act = scan.nextInt();

		if (act == 1) {
			int result = CommonMax(max, min);
			System.out.println("최대공약수는 " + result + " 입니다.");
		} else if (act == 2) {
			int result = CommonMin(max, min);
			System.out.println("최소공배수는 " + result + " 입니다.");
		} else if (act == 3) {
			System.out.println("프로그램을 종료합니다.");
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
