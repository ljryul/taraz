package numToBinary;

import java.util.Scanner;

/*
 * Title : 10���� ���ڸ� 2������ �ٲ۵� 4�ڸ��� ���� ���(�ִ� 4����Ʈ)
 * Author : ljryul
 * Special Thanks : BumNyeong Kim
 */

public class NumToBinary {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;

		System.out.println("���������� �ٲ� ���ڸ� �Է��ϼ���.(�ִ� 2,147,483,647����, 0�� �Է��ϸ� ����)");

		// ���ڸ� �Է¹ް� ���ڰ� �ƴҰ�� Exception �� ���Է�
		while (true) {
			try {
				num = scan.nextInt();

				// �Է¹��� ���ڰ� 0�̸� ����
				if (num == 0) {
					System.out.println("���α׷� ����");
					scan.close();
					break;
				}

				// ��ȯŬ���� ����
				NumToBin(num);

				System.out.println("\n��ȯ �Ϸ�, ���ο� ���ڸ� �Է��ϼ���.(0�� �Է��ϸ� �����մϴ�)");
			} catch (Exception e) {
				System.out.println("������ �Է��ϼ���");
				scan.next();
			}
		}
	}

	private static void NumToBin(int num) {

		// �Է¹��� ���ڸ� 2������ ��ȯ(StringŸ��)�Ͽ� bin�� ����
		System.out.println("��ȯ����");
		String bin = Integer.toBinaryString(num);
		System.out.println("2���� : " + bin);

		// StringBuffer�� 32 - bin�� ������ŭ 0�� ������� �� binNum �Է�
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 32 - bin.length(); i++) {
			sb.append("0");
		}
		sb.append(bin);

		// initNum �迭�� ���ݱ��� �Էµ� ���� �ϳ��� ����
		String[] initNum = sb.toString().split("");

		// ����� ���
		System.out.println("����� ���");
		
		// 4�ڸ����� ���� �߰�
		for (int i = 0; i < initNum.length; i++) {
			System.out.printf(initNum[i]);
			if ((i + 1) % 4 == 0)
				System.out.printf(" ");
		}
	}
}
