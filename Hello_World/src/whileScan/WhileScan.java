package whileScan;

import java.util.Scanner;

/*
 * Title : ������ �Է¹޾� ������ 300�� �Ѿ�� ����
 * Author : ljryul
 */

public class WhileScan {

	public static void main(String[] args) {
		
		int num = 0;		//�Է¹��� ���ڸ� ������ ����
		int sum = 0;		//�Էµ� ���ڸ� ���� ��
		Scanner scan = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		
		//���� �Է� & �տ��� ����
		while (sum < 300) {
			num = scan.nextInt();
			sum = sum + num;
			
			System.out.println("�Է¹��� �� : " + num);
			System.out.println("��������� ���� : " + sum);
			
			if (sum < 300)
				System.out.println("���� ������ �Է��ϼ���");
		}
		
		System.out.println("����");
		System.out.println("���� : " + sum);

		scan.close();
	}
}
