package caesarCiphere;

import java.util.Scanner;

/*
 * Title : 카이사르 비밀문(알파벳을 3글자씩 밀려쓰기) ※char형태로 아스키코드값을 변형시켜 출력 
 * Author : ljryul
 */

public class CaesarCiphere {

	static public Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String str;
		char temp;
		int count = 0;
		
		System.out.println("비밀문을 입력하시오");
		
		str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			temp = (char) (str.charAt(i) - 3);

			if (temp == 29) { // 띄어쓰기(아스키코드 32가 공백이므로 3을 빼면 29)
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
