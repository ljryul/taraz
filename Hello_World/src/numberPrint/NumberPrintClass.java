package numberPrint;

import java.util.Scanner;

/*
 * Title : 임의의 숫자 10개를 입력받아 배열에 저장한 후, 오름차순 정렬하여 출력
 * Author : ljryul
 */


public class NumberPrintClass {
	public static class NumArr{ //숫자를 저장할 전역배열
		public static int arr[] = new int[10];
	}

	public static void main(String[] args) {
		useScan();	//숫자 10개를 입력받아 배열에 저장
		useArr();	//배열에 저장된 수를 오름차순으로 정렬
		useFor();	//for문을 사용하여 배열에 저장된 숫자 출력
	}

	private static void useScan() {	//숫자  입력받아 배열에 저장
		Scanner scan = new Scanner(System.in);
		System.out.println("10개의 숫자를 입력하시오");
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + "번째 숫자를 입력하세요");
			NumArr.arr[i] = scan.nextInt();
		}
		System.out.println("입력 끝");
		scan.close();
		useFor();
	}

	private static void useArr() {	//배열에 저장된 수를 오름차순으로 정렬
		int temp;
		System.out.println("오름차순 정렬 시작");
		for(int i = 0; i < NumArr.arr.length; i++) {
			for(int j = i+1; j < NumArr.arr.length; j++) {
				if(NumArr.arr[i] > NumArr.arr[j]) {
					temp = NumArr.arr[j];
					NumArr.arr[j] = NumArr.arr[i];
					NumArr.arr[i] = temp;
				} else break;
			}
		}
		System.out.println("오름차순 정렬 끝");
	}

	private static void useFor() {	//for문을 사용하여 배열에 저장된 숫자 출력
		System.out.println("입력된 숫자 출력 시작");
		for(int i = 0; i < NumArr.arr.length; i ++) {
			System.out.println(NumArr.arr[i]);
		}
		System.out.println("입력된 숫자 출력 끝");
	}
}
