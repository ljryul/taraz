package upAndDown;

import java.util.Random;
import java.util.Scanner;

/*
 * Title : 1 ~ 100 ������ ������ �����ϰ� ����ڿ��� ���ڸ� �Է¹޾� Up Down ���, 10������ �����߸� ���� ���� 
 * Author : ljryul
 */

public class UpAndDown {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int randNum = rand.nextInt(100) + 1;
		int scanNum = 0;

		System.out.println("Up&Down ���� ����");
		
		//���� ����
		for (int gameCount = 0; gameCount < 10; gameCount++) {

			//���� �Է�
			System.out.printf("%d��° ���ڸ� �Է��ϼ���.%n",gameCount+1);
			scanNum = scan.nextInt();
			
			//����
			if (scanNum == randNum) {
				System.out.println("�����Դϴ�!");
				break;
			} else if (scanNum < randNum) {
				System.out.println(scanNum + "���� Ů�ϴ�.");
			} else
				System.out.println(scanNum + "���� �۽��ϴ�.");

			//����Ƚ�� ������
			if (gameCount == 9) {
				System.out.printf("���ӳ�! %n������ " + randNum + "�Դϴ�.");
			}
		}
		scan.close();
	}
}
