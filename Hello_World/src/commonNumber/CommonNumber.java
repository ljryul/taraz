package commonNumber;

import java.util.Scanner;

public class CommonNumber {

	static public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// max : �� ���� ū��, min : �� ���� ������, num1, num2 : �Է¹��� ��, act : ������ �۾�
		int max, min, num1, num2, act;

		while (true) {
			
			// ���ڸ� �Է¹޵��� try ~ catch �ۼ�
			try {
				
				// �� ���� �Է¹���
				System.out.println("ù��° ���ڸ� �Է��ϼ���.");
				num1 = scan.nextInt();
				System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
				num2 = scan.nextInt();
				
				// �� ���ڸ� ���Ͽ� ū�� ������ ����
				if (num1 > num2) {
					max = num1;
					min = num2;
				} else {
					max = num2;
					min = num1;
				}
				
				// ������ �۾� �Է¹���, while���� ����Ͽ� ���ѹݺ�
				while (true) {
					
					// ������ �۾� �Է�
					System.out.println("������ �۾��� ��ȣ�� �Է��ϼ���.");
					System.out.println("1. �ִ�����	2. �ּҰ����	3. ����");
					
					// �۾� �Է½� ���ڰ� �ƴϸ� try ~ catch �۵�
					try {
						act = scan.nextInt();
						
						// �Էµ� ���ں��� �۾�, 1 : �ִ�����, 2 : �ּҰ����, 3 : ����, �ٸ� ���ڸ� �Է��ϸ� 1~3������ �Է� �ȳ�
						if (act == 1) {
							int result = CommonMax(max, min);
							System.out.println("�ִ������� " + result + " �Դϴ�.");
						} else if (act == 2) {
							int result = CommonMin(max, min);
							System.out.println("�ּҰ������ " + result + " �Դϴ�.");
						} else if (act == 3) {
							System.out.println("���α׷��� �����մϴ�.");
							scan.close();
							return;
						} else {
							System.out.println("1 ~ 3������ ���ڸ� �Է��ϼ���.");
						}
					} catch (Exception e) {
						System.out.println("1 ~ 3������ ���ڸ� �Է��ϼ���.");
						scan.next();
					}
				}
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼ���");
				scan.next();
			}
		}
	}

	// �ּҰ���� ���ϱ�
	private static int CommonMin(int max, int min) {

		// �ּҰ���� : �� ���� ���� �ִ������� ���� ��
		int result = max * min / CommonMax(max, min);
		return result;
	}

	// �ִ����� ���ϱ�
	private static int CommonMax(int max, int min) {

		int result = 1;
		
		// �� ���� 1���� �����ϴ� ���ڷ� ������ �ִ밪�� ���
		for (int i = 1; i < min + 1; i++) {
			if (max % i == 0 && min % i == 0) {
				if (i > result) {
					result = i;
				}
			}
		}
		return result;
	}
}
