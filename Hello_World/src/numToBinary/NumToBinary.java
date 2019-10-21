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

				if (num == 0) {
					System.out.println("���α׷� ����");
					scan.close();
					break;
				}

				NumToBin(num);
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("������ �Է��ϼ���");
				scan.next();
			}
		}
	}

	private static void NumToBin(int num) {
		
		// �Է¹��� ���ڸ� 2������ ��ȯ(StringŸ��)�Ͽ� bin�� ����
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);

		// bin�� ����� ���ڸ� 4�ڸ��� ��� ���
		String[] binNum;
		binNum = bin.split("");
		for (int i = 0; i < binNum.length; i++) {
			System.out.printf(binNum[i]);
			if ((i+1) % 4 == 0) {
				System.out.printf(" ");
			}
		}
		System.out.println("");
	}
}
