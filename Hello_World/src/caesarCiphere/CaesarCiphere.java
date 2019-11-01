package caesarCiphere;

import java.util.Scanner;

/*
 * Title : ī�̻縣 ��й�(���ĺ��� 3���ھ� �з�����) ��char���·� �ƽ�Ű�ڵ尪�� �������� ��� 
 * Author : ljryul
 */

public class CaesarCiphere {

	static public Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String str;
		String task;

		while (true) {
			System.out.println("������ �۾��� ���ÿ�\n 1. ��ȣȭ 2. ��ȣȭ 0. ����");
			task = sc.nextLine();
			switch (task) {
			case "1":
				System.out.println("��ȣȭ�� ������ �Է��Ͻÿ�");
				str = sc.nextLine();
				Enctyption(str);
				break;
			case "2":
				System.out.println("��ȣȭ�� ������ �Է��Ͻÿ�");
				str = sc.nextLine();
				Decryption(str);
				break;
			case "0":
				System.out.println("���α׷� ����");
				sc.close();
				return;
			default:
				break;
			}
		}
	}

	private static void Enctyption(String str) {
		
		char temp;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			temp = (char) (str.charAt(i) + 3);

			if (temp == 35) { // ����(�ƽ�Ű�ڵ� 32�� �����̹Ƿ� 3�� ���ϸ� 35)
				temp = ' ';
			} else if (temp > 122) { // �ҹ���, x�� ������ a�� �Ž��� �ö�
				count = ((int) temp - 122);
				temp = (char) (96 + count);
			} else if (temp > 90 && temp < 96) { // �빮��, X�� ������ A�� �Ž��� �ö�
				count = ((int) temp - 90 );
				temp = (char) (64 + count);
			}

			System.out.print(temp);
		}
		System.out.println();
	}

	private static void Decryption(String str) {

		char temp;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			temp = (char) (str.charAt(i) - 3);

			if (temp == 29) { // ����(�ƽ�Ű�ڵ� 32�� �����̹Ƿ� 3�� ���� 29)
				temp = ' ';
			} else if (temp < 65) { // �빮��, A�� ������ X�� �Ž��� �ö�
				count = (65 - (int) temp);
				temp = (char) (91 - count);
			} else if (temp < 97 && temp > 90) { // �ҹ���, a�� ������ x�� �Ž��� �ö�
				count = (97 - (int) temp);
				temp = (char) (123 - count);
			}

			System.out.print(temp);
		}
		System.out.println();
	}
}
