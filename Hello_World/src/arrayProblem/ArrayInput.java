package arrayProblem;

import java.util.Scanner;

/*
 * Title : 배열에 10개의 숫자를 중복없이 입력받아 최댓값, 최솟값, 오름차순, 내림차순, 검색하기 
 * Author : ljryul
 * Special Thanks : BumNyeong Kim
 */

public class ArrayInput {
	
	static public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);

		int[] arryNum = new int[10];
		int select;

		System.out.println("10개의 숫자를 입력하시오");
		for (int i = 0; i < 10; i++) {
			try {
				arryNum[i] = scan.nextInt();
				for (int j = 0; j < i; j++) {
					if (arryNum[i] == arryNum[j]) {
						System.out.println("입력한 숫자 " + arryNum[j] + "은(는) 중복된 숫자입니다. 다시 입력하세요");
						i--;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("숫자만 입력하세요");
				scan.next();
			}
		}

		System.out.print("입력된 숫자 : ");
		for (int i : arryNum) {
			System.out.print(i + " ");
		}

		while (true) {
			System.out.println("\n실행할 작업의 번호를 선택하세요");
			System.out.println("1.최댓값   2.최솟값  3.오름차순 정렬  4.내림차순 정렬  5.검색하기  0.종료");
			try {
				select = scan.nextInt();

				switch (select) {

				case 1:
					FindMax(arryNum);
					break;
				case 2:
					FindMin(arryNum);
					break;
				case 3:
					Asc(arryNum);
					break;
				case 4:
					Desc(arryNum);
					break;
				case 5:
					Search(arryNum);
					break;
				case 0:
					System.out.println("프로그램 종료");
					scan.close();
					return;
				default:
					break;

				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("숫자만 입력하세요");
				scan.next();
			}
		}
	}

	private static void Search(int[] arryNum) {
		//Scanner scan = new Scanner(System.in);
		int sNum;
		int fNum = -1;
		System.out.println("찾을 숫자를 입력하세요");
		try {
			sNum = scan.nextInt();
			for (int i = 0; i < arryNum.length; i++) {
				if (arryNum[i] == sNum) {
					fNum = i;
					break;
				}
			}
			if (fNum != -1) {
				System.out.println(sNum + "은(는) 배열의 " + (fNum + 1) + "번째에 존재합니다");
			} else {
				System.out.println("해당하는 숫자는 존재하지 않습니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("숫자만 입력하세요");
			scan.next();
		}
	}

	private static void Desc(int[] arryNum) {
		int temp;
		for (int i = 0; i < arryNum.length; i++) {
			for (int j = i + 1; j < arryNum.length; j++) {
				if (arryNum[i] < arryNum[j]) {
					temp = arryNum[i];
					arryNum[i] = arryNum[j];
					arryNum[j] = temp;
				}
			}
		}
		System.out.println("내림차순 정렬");
		for (int i : arryNum) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void Asc(int[] arryNum) {
		int temp;
		for (int i = 0; i < arryNum.length; i++) {
			for (int j = i + 1; j < arryNum.length; j++) {
				if (arryNum[i] > arryNum[j]) {
					temp = arryNum[i];
					arryNum[i] = arryNum[j];
					arryNum[j] = temp;
				}
			}
		}
		System.out.println("오름차순 정렬");
		for (int i : arryNum) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void FindMin(int[] arryNum) {
		int min = arryNum[0];
		for (int i = 0; i < arryNum.length; i++) {
			if (arryNum[i] < min) {
				min = arryNum[i];
			}
		}
		System.out.println("최솟값 : " + min);
	}

	private static void FindMax(int[] arryNum) {
		int max = arryNum[0];
		for (int i = 0; i < arryNum.length; i++) {
			if (arryNum[i] > max) {
				max = arryNum[i];
			}
		}
		System.out.println("최댓값 : " + max);
	}
}
