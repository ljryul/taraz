package prime_Number;

import java.util.Scanner;

/*
 * Title : ���ڸ� �Է¹޾� �Ҽ� �Ǻ��ϱ� (�׽�Ʈ�� �Ҽ� :  2147483647)
 * Author : ljryul
 */

public class Prime_Number_Check {
	
	static public Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		long num;
		
		while (true) {
			try {
				System.out.println("���ڸ� �Է��ϼ���(0�� �Է��ϸ� �����մϴ�).");
				num = scan.nextLong();
				
				if(num == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				
				if (isPrime(num)) {
					System.out.println(num + "��(��) �Ҽ��̴�.");
				} else {
					System.out.println(num + "��(��) �Ҽ��� �ƴϴ�.");
				}
				
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼ���.");
				scan.next();
			} 
		}
		
		scan.close();
		
	}

	private static boolean isPrime(long num) {
		
		if(num == 1) {	// 1�� �Ҽ��� �ƴϴ�
			return false;
		} else if (num == 2) {	// 2�� �Ҽ���
			return true;
		}
		
		for(long i = 3; i*i <= num; i+=2) {	// 3���� �ִ��������� ������ Ȧ���θ� ��������
		//for(long i = 3; i < num; i+=2) {	// 3���� num-1������ ������ Ȧ���θ� ��������
			if( num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
