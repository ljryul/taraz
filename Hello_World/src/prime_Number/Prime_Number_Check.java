package prime_Number;

import java.util.Scanner;

/*
 * Title : 숫자를 입력받아 소수 판별하기 (테스트용 소수 :  2147483647)
 * Author : ljryul
 */

public class Prime_Number_Check {
	
	static public Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		long num;
		
		while (true) {
			try {
				System.out.println("숫자를 입력하세요(0을 입력하면 종료합니다).");
				num = scan.nextLong();
				
				if(num == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				if (isPrime(num)) {
					System.out.println(num + "은(는) 소수이다.");
				} else {
					System.out.println(num + "은(는) 소수가 아니다.");
				}
				
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요.");
				scan.next();
			} 
		}
		
		scan.close();
		
	}

	private static boolean isPrime(long num) {
		
		if(num == 1) {	// 1은 소수가 아니다
			return false;
		} else if (num == 2) {	// 2는 소수다
			return true;
		}
		
		for(long i = 3; i*i <= num; i+=2) {	// 3부터 최대약수까지의 범위중 홀수로만 나눠보기
		//for(long i = 3; i < num; i+=2) {	// 3부터 num-1까지의 숫자중 홀수로만 나눠보기
			if( num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
