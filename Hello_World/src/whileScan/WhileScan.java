package whileScan;

import java.util.Scanner;

/*
 * Title : 정수를 입력받아 총합이 300을 넘어가면 종료
 * Author : ljryul
 */

public class WhileScan {

	public static void main(String[] args) {
		
		int num = 0;		//입력받은 숫자를 저장할 변수
		int sum = 0;		//입력된 숫자를 더한 값
		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		
		//숫자 입력 & 합연산 시작
		while (sum < 300) {
			num = scan.nextInt();
			sum = sum + num;
			
			System.out.println("입력받은 수 : " + num);
			System.out.println("현재까지의 총합 : " + sum);
			
			if (sum < 300)
				System.out.println("다음 정수를 입력하세요");
		}
		
		System.out.println("종료");
		System.out.println("총합 : " + sum);

		scan.close();
	}
}
