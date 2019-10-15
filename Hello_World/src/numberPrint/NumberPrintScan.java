package numberPrint;

import java.util.Scanner;

/*
 * Title : inputed 10 number print(use Scanner) 
 * Author : ljryul
 */

public class NumberPrintScan {
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10개의 숫자 입력");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("입력된 숫자들");
		
		for(int j=0; j <10; j++) {
			System.out.println(arr[j]);
		}
		
		sc.close();
	}

}
