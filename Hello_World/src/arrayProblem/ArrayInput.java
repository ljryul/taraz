package arrayProblem;

import java.util.Scanner;

/*
 * Title : �迭�� 10���� ���ڸ� �ߺ����� �Է¹޾� �ִ�, �ּڰ�, ��������, ��������, �˻��ϱ� 
 * Author : ljryul
 * Special Thanks : BumNyeong Kim
 */

public class ArrayInput {
	
	static public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);

		int[] arryNum = new int[10];
		int select;

		System.out.println("10���� ���ڸ� �Է��Ͻÿ�");
		for (int i = 0; i < 10; i++) {
			try {
				arryNum[i] = scan.nextInt();
				for (int j = 0; j < i; j++) {
					if (arryNum[i] == arryNum[j]) {
						System.out.println("�Է��� ���� " + arryNum[j] + "��(��) �ߺ��� �����Դϴ�. �ٽ� �Է��ϼ���");
						i--;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("���ڸ� �Է��ϼ���");
				scan.next();
			}
		}

		System.out.print("�Էµ� ���� : ");
		for (int i : arryNum) {
			System.out.print(i + " ");
		}

		while (true) {
			System.out.println("\n������ �۾��� ��ȣ�� �����ϼ���");
			System.out.println("1.�ִ�   2.�ּڰ�  3.�������� ����  4.�������� ����  5.�˻��ϱ�  0.����");
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
					System.out.println("���α׷� ����");
					scan.close();
					return;
				default:
					break;

				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("���ڸ� �Է��ϼ���");
				scan.next();
			}
		}
	}

	private static void Search(int[] arryNum) {
		//Scanner scan = new Scanner(System.in);
		int sNum;
		int fNum = -1;
		System.out.println("ã�� ���ڸ� �Է��ϼ���");
		try {
			sNum = scan.nextInt();
			for (int i = 0; i < arryNum.length; i++) {
				if (arryNum[i] == sNum) {
					fNum = i;
					break;
				}
			}
			if (fNum != -1) {
				System.out.println(sNum + "��(��) �迭�� " + (fNum + 1) + "��°�� �����մϴ�");
			} else {
				System.out.println("�ش��ϴ� ���ڴ� �������� �ʽ��ϴ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���ڸ� �Է��ϼ���");
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
		System.out.println("�������� ����");
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
		System.out.println("�������� ����");
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
		System.out.println("�ּڰ� : " + min);
	}

	private static void FindMax(int[] arryNum) {
		int max = arryNum[0];
		for (int i = 0; i < arryNum.length; i++) {
			if (arryNum[i] > max) {
				max = arryNum[i];
			}
		}
		System.out.println("�ִ� : " + max);
	}
}
