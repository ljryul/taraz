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
				
				System.out.println("\n2진변환 완료, 새로운 숫자를 입력하세요(0을 입력하면 종료합니다)");
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("정수를 입력하세요");
				scan.next();
			}
		}
	}

	private static void NumToBin(int num) {

		String[] binNum;
		//String[] intNum = new String[32];
		
		/*
		// 0으로 초기화되어있는 8바이트 배열 선언
		System.out.println("intNum배열 생성");
		for (int i = 0; i < 32; i++) {
			intNum[i] = "0";
		}
		*/

		/*
		// intNum 배열 확인
		System.out.println("intNum배열 확인");
		for(int i = 0; i <intNum.length ; i++) { 
		 	System.out.printf(intNum[i] + " ");
		 }
		*/

		// 입력받은 숫자를 2진수로 변환(String타입)하여 bin에 저장
		System.out.println("\n변환시작");
		String bin = Integer.toBinaryString(num);
		int binCount = bin.length();
		System.out.println("2진변환 : \n" + bin);
		System.out.println("bin갯수 : \n" + binCount);

		// bin에 저장된 숫자를 binNum에 한자리씩 저장
		System.out.println("binNum배열에 2진수를 저장함");
		binNum = bin.split("");
			
		for(String b : binNum) {
			System.out.printf(b);
		}
		
		System.out.println();
		
		//StringBuffer에 32 - binCount 숫자만큼 0을 집어넣은 후 binNum 넣어서 출력
		System.out.println("StringBuffer에 숫자 입력 시작");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 32 - binCount; i++) {
			sb.append("0");
		}
		sb.append(bin);
		System.out.println("입력된 숫자 : " +sb);
		
		String[] initNum = sb.toString().split("");
		
		System.out.println("새로 저장된 initNum 출력");
		for(int i = 0; i <initNum.length ; i++) {
			System.out.printf(initNum[i]);
			if((i+1)%4==0)	System.out.printf(" ");
		}
		
		
		
		// binNum 내용 확인 및 4자리씩 끊어서 출력
		/*
		 for (int i = 0; i < binNum.length; i++) { System.out.printf(binNum[i]); if
		 ((i+1) % 4 == 0) { System.out.printf(" "); } }
		 */
/*
		// intNum 배열에 binNum 배열의 내용 덮어쓰기(8바이트형태로 출력하기 위함)
		System.out.println("intNum배열에 binNum배열을 저장함");
		for (int i = binNum.length-1; i >= 0; i--) {
			intNum[i] = binNum[i];
		}
		
		// intNum 출력
		System.out.println("새로 저장된 intNum 출력");
		for(int i = 0; i <intNum.length ; i++) {
			System.out.printf(intNum[i]);
			if((i+1)%4==0)	System.out.printf(" ");
		}
*/
	}
}
