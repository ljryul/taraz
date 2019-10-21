package numToBinary;

import java.util.Scanner;

/*
 * Title : 10���� ���ڸ� 2������ �ٲ۵� byte ������ ���� ���
 * Author : ljryul
 */

public class NumToBinary {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Integer num = null;

		System.out.println("���������� �ٲ� ���ڸ� �Է��ϼ���.(0�� �Է��ϸ� ����˴ϴ�)");

		while (true) {
			// ���ڸ� �Է¹ް� ���ڰ� �ƴҰ�� Exception
			
			try {
				num = scan.nextInt();
			} catch (Exception e) {
				System.out.println("������ �Է��ϼ���");
				e.printStackTrace();
				num = null;
			}
			
			if(num == 0) {
				scan.close();
				break;
			}
			
			NumToBin(num);
		}
	}

	private static void NumToBin(int num) {
		/*
		 * �Էµ� ���ڸ� �������� ��ȯ�Ͽ� �ڸ����� ���� 0 ����("%05d" �� �κ����� �ڸ��� ����) String bin; bin =
		 * String.format("%05d",
		 * Integer.parseInt(Integer.toBinaryString(num).toString()));
		 * System.out.printf("�Է��� ���� : %d%n������ȯ : %s",num,bin);
		 */

		//�Է¹��� ���ڸ� 2������ ��ȯ(StringŸ��)�Ͽ� String bin�� ����
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);

	}
}
