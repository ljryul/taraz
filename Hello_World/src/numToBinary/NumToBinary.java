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

				if (num == 0) {
					System.out.println("프로그램 종료");
					scan.close();
					break;
				}

				NumToBin(num);
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("정수를 입력하세요");
				scan.next();
			}
		}
	}

	private static void NumToBin(int num) {
		
		// 입력받은 숫자를 2진수로 변환(String타입)하여 bin에 저장
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);

		// bin에 저장된 숫자를 4자리씩 끊어서 출력
		String[] binNum;
		binNum = bin.split("");
		for (int i = 0; i < binNum.length; i++) {
			System.out.printf(binNum[i]);
			if ((i+1) % 4 == 0) {
				System.out.printf(" ");
			}
		}
		System.out.println("");
	}
}
