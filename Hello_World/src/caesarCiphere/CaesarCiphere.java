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
		String task;

		while (true) {
			System.out.println("수행할 작업을 고르시오\n 1. 암호화 2. 복호화 0. 종료");
			task = sc.nextLine();
			switch (task) {
			case "1":
				System.out.println("암호화할 문구를 입력하시오");
				str = sc.nextLine();
				Enctyption(str);
				break;
			case "2":
				System.out.println("복호화할 문구를 입력하시오");
				str = sc.nextLine();
				Decryption(str);
				break;
			case "0":
				System.out.println("프로그램 종료");
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

			if (temp == 35) { // 띄어쓰기(아스키코드 32가 공백이므로 3을 더하면 35)
				temp = ' ';
			} else if (temp > 122) { // 소문자, x가 들어오면 a로 거슬러 올라감
				count = ((int) temp - 122);
				temp = (char) (96 + count);
			} else if (temp > 90 && temp < 96) { // 대문자, X가 들어오면 A로 거슬러 올라감
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

			if (temp == 29) { // 띄어쓰기(아스키코드 32가 공백이므로 3을 빼면 29)
				temp = ' ';
			} else if (temp < 65) { // 대문자, A가 들어오면 X로 거슬러 올라감
				count = (65 - (int) temp);
				temp = (char) (91 - count);
			} else if (temp < 97 && temp > 90) { // 소문자, a가 들어오면 x로 거슬러 올라감
				count = (97 - (int) temp);
				temp = (char) (123 - count);
			}

			System.out.print(temp);
		}
		System.out.println();
	}
}
