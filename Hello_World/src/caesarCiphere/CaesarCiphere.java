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
		char temp;
		int count = 0;
		
		System.out.println("��й��� �Է��Ͻÿ�");
		
		str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			temp = (char) (str.charAt(i) - 3);

			if (temp == 29) { // ����(�ƽ�Ű�ڵ� 32�� �����̹Ƿ� 3�� ���� 29)
				temp = ' ';
			} else if (temp < 65) { // 
				count = (65 - (int) temp);
				temp = (char) (91 - count);
			} else if (temp < 97) { // 
				count = (97 - (int) temp);
				temp = (char) (123 - count);
			}
		
			System.out.print(temp);
		}
		
		System.out.println();
		sc.close();
	}
}
