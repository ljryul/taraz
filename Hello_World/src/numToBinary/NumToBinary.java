package numToBinary;

import java.util.Scanner;

/*
 * Title : 10진수 숫자를 2진수로 바꾼뒤 4자리씩 분할 출력(최대 4바이트)
 * Author : ljryul
 * Special Thanks : BumNyeong Kim
 */

public class NumToBinary {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;

		System.out.println("이진법으로 바꿀 숫자를 입력하세요.(최대 2,147,483,647까지, 0을 입력하면 종료)");

		// 숫자만 입력받고 숫자가 아닐경우 Exception 후 재입력
		while (true) {
			try {
				num = scan.nextInt();

				// 입력받은 숫자가 0이면 종료
				if (num == 0) {
					System.out.println("프로그램 종료");
					scan.close();
					break;
				}

				// 변환클래스 실행
				NumToBin(num);

				System.out.println("\n변환 완료, 새로운 숫자를 입력하세요.(0을 입력하면 종료합니다)");
			} catch (Exception e) {
				System.out.println("정수를 입력하세요");
				scan.next();
			}
		}
	}

	private static void NumToBin(int num) {

		// 입력받은 숫자를 2진수로 변환(String타입)하여 bin에 저장
		System.out.println("변환시작");
		String bin = Integer.toBinaryString(num);
		System.out.println("2진수 : " + bin);

		// StringBuffer에 32 - bin의 갯수만큼 0을 집어넣은 후 binNum 입력
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 32 - bin.length(); i++) {
			sb.append("0");
		}
		sb.append(bin);

		// initNum 배열에 지금까지 입력된 숫자 하나씩 넣음
		String[] initNum = sb.toString().split("");

		// 결과물 출력
		System.out.println("결과물 출력");
		
		// 4자리마다 공백 추가
		for (int i = 0; i < initNum.length; i++) {
			System.out.printf(initNum[i]);
			if ((i + 1) % 4 == 0)
				System.out.printf(" ");
		}
	}
}
