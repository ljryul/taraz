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
				
				System.out.println("\n2����ȯ �Ϸ�, ���ο� ���ڸ� �Է��ϼ���(0�� �Է��ϸ� �����մϴ�)");
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("������ �Է��ϼ���");
				scan.next();
			}
		}
	}

	private static void NumToBin(int num) {

		String[] binNum;
		//String[] intNum = new String[32];
		
		/*
		// 0���� �ʱ�ȭ�Ǿ��ִ� 8����Ʈ �迭 ����
		System.out.println("intNum�迭 ����");
		for (int i = 0; i < 32; i++) {
			intNum[i] = "0";
		}
		*/

		/*
		// intNum �迭 Ȯ��
		System.out.println("intNum�迭 Ȯ��");
		for(int i = 0; i <intNum.length ; i++) { 
		 	System.out.printf(intNum[i] + " ");
		 }
		*/

		// �Է¹��� ���ڸ� 2������ ��ȯ(StringŸ��)�Ͽ� bin�� ����
		System.out.println("\n��ȯ����");
		String bin = Integer.toBinaryString(num);
		int binCount = bin.length();
		System.out.println("2����ȯ : \n" + bin);
		System.out.println("bin���� : \n" + binCount);

		// bin�� ����� ���ڸ� binNum�� ���ڸ��� ����
		System.out.println("binNum�迭�� 2������ ������");
		binNum = bin.split("");
			
		for(String b : binNum) {
			System.out.printf(b);
		}
		
		System.out.println();
		
		//StringBuffer�� 32 - binCount ���ڸ�ŭ 0�� ������� �� binNum �־ ���
		System.out.println("StringBuffer�� ���� �Է� ����");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 32 - binCount; i++) {
			sb.append("0");
		}
		sb.append(bin);
		System.out.println("�Էµ� ���� : " +sb);
		
		String[] initNum = sb.toString().split("");
		
		System.out.println("���� ����� initNum ���");
		for(int i = 0; i <initNum.length ; i++) {
			System.out.printf(initNum[i]);
			if((i+1)%4==0)	System.out.printf(" ");
		}
		
		
		
		// binNum ���� Ȯ�� �� 4�ڸ��� ��� ���
		/*
		 for (int i = 0; i < binNum.length; i++) { System.out.printf(binNum[i]); if
		 ((i+1) % 4 == 0) { System.out.printf(" "); } }
		 */
/*
		// intNum �迭�� binNum �迭�� ���� �����(8����Ʈ���·� ����ϱ� ����)
		System.out.println("intNum�迭�� binNum�迭�� ������");
		for (int i = binNum.length-1; i >= 0; i--) {
			intNum[i] = binNum[i];
		}
		
		// intNum ���
		System.out.println("���� ����� intNum ���");
		for(int i = 0; i <intNum.length ; i++) {
			System.out.printf(intNum[i]);
			if((i+1)%4==0)	System.out.printf(" ");
		}
*/
	}
}
