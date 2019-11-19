package commonNumber;

import java.util.Scanner;

public class CommonNumber {

	static public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// max : 두 값중 큰값, min : 두 값중 작은값, num1, num2 : 입력받을 수, act : 수행할 작업
		int max, min, num1, num2, act;

		while (true) {
			
			// 숫자만 입력받도록 try ~ catch 작성
			try {
				
				// 두 숫자 입력받음
				System.out.println("첫번째 숫자를 입력하세요.");
				num1 = scan.nextInt();
				System.out.println("두번째 숫자를 입력하세요.");
				num2 = scan.nextInt();
				
				// 두 숫자를 비교하여 큰수 작은수 설정
				if (num1 > num2) {
					max = num1;
					min = num2;
				} else {
					max = num2;
					min = num1;
				}
				
				// 수행할 작업 입력받음, while문을 사용하여 무한반복
				while (true) {
					
					// 수행할 작업 입력
					System.out.println("수행할 작업의 번호를 입력하세요.");
					System.out.println("1. 최대공약수	2. 최소공배수	3. 종료");
					
					// 작업 입력시 숫자가 아니면 try ~ catch 작동
					try {
						act = scan.nextInt();
						
						// 입력된 숫자별로 작업, 1 : 최대공약수, 2 : 최소공배수, 3 : 종료, 다른 숫자를 입력하면 1~3까지만 입력 안내
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
						} else {
							System.out.println("1 ~ 3까지의 숫자를 입력하세요.");
						}
					} catch (Exception e) {
						System.out.println("1 ~ 3까지의 숫자를 입력하세요.");
						scan.next();
					}
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				scan.next();
			}
		}
	}

	// 최소공배수 구하기
	private static int CommonMin(int max, int min) {

		// 최소공배수 : 두 수의 곱을 최대공약수로 나눈 값
		int result = max * min / CommonMax(max, min);
		return result;
	}

	// 최대공약수 구하기
	private static int CommonMax(int max, int min) {

		int result = 1;
		
		// 두 수를 1부터 증가하는 숫자로 나눠서 최대값만 출력
		for (int i = 1; i < min + 1; i++) {
			if (max % i == 0 && min % i == 0) {
				if (i > result) {
					result = i;
				}
			}
		}
		return result;
	}
}
