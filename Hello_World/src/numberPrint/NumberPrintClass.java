package numberPrint;

import java.util.Scanner;

/*
 * Title : ������ ���� 10���� �Է¹޾� �迭�� ������ ��, �������� �����Ͽ� ���
 * Author : ljryul
 */


public class NumberPrintClass {
	public static class NumArr{ //���ڸ� ������ �����迭
		public static int arr[] = new int[10];
	}

	public static void main(String[] args) {
		useScan();	//���� 10���� �Է¹޾� �迭�� ����
		useArr();	//�迭�� ����� ���� ������������ ����
		useFor();	//for���� ����Ͽ� �迭�� ����� ���� ���
	}

	private static void useScan() {	//����  �Է¹޾� �迭�� ����
		Scanner scan = new Scanner(System.in);
		System.out.println("10���� ���ڸ� �Է��Ͻÿ�");
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + "��° ���ڸ� �Է��ϼ���");
			NumArr.arr[i] = scan.nextInt();
		}
		System.out.println("�Է� ��");
		scan.close();
		useFor();
	}

	private static void useArr() {	//�迭�� ����� ���� ������������ ����
		int temp;
		System.out.println("�������� ���� ����");
		for(int i = 0; i < NumArr.arr.length; i++) {
			for(int j = i+1; j < NumArr.arr.length; j++) {
				if(NumArr.arr[i] > NumArr.arr[j]) {
					temp = NumArr.arr[j];
					NumArr.arr[j] = NumArr.arr[i];
					NumArr.arr[i] = temp;
				} else break;
			}
		}
		System.out.println("�������� ���� ��");
	}

	private static void useFor() {	//for���� ����Ͽ� �迭�� ����� ���� ���
		System.out.println("�Էµ� ���� ��� ����");
		for(int i = 0; i < NumArr.arr.length; i ++) {
			System.out.println(NumArr.arr[i]);
		}
		System.out.println("�Էµ� ���� ��� ��");
	}
}
