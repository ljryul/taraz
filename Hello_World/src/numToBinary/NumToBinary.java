package numToBinary;

import java.util.Scanner;

/*
 * Title : 10진수 숫자를 2진수로 바꾼뒤 byte 단위로 분할 출력
 * Author : ljryul
 */

public class NumToBinary {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Integer num = null;

		System.out.println("이진법으로 바꿀 숫자를 입력하세요.(0을 입력하면 종료됩니다)");

		while (true) {
			// 숫자만 입력받고 숫자가 아닐경우 Exception
			
			try {
				num = scan.nextInt();
			} catch (Exception e) {
				System.out.println("정수를 입력하세요");
				e.printStackTrace();
				num = null;
			}
			
			if(num == 0) {
				scan.close();
				break;
			}
			
			NumToBin(num);
		}
	}

	private static void NumToBin(int num) {
		/*
		 * 입력된 숫자를 이진수로 변환하여 자릿수에 맞춰 0 삽입("%05d" 이 부분으로 자릿수 설정) String bin; bin =
		 * String.format("%05d",
		 * Integer.parseInt(Integer.toBinaryString(num).toString()));
		 * System.out.printf("입력한 숫자 : %d%n이진변환 : %s",num,bin);
		 */

		//입력받은 숫자를 2진수로 변환(String타입)하여 String bin에 저장
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);

	}
}
