package upAndDown;

import java.util.Random;
import java.util.Scanner;

/*
 * Title : 1 ~ 100 사이의 난수를 생성하고 사용자에게 숫자를 입력받아 Up Down 출력, 10번동안 못맞추면 정답 공개 
 * Author : ljryul
 */

public class UpAndDown {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int randNum = rand.nextInt(100) + 1;
		int scanNum = 0;

		System.out.println("Up&Down 게임 시작");
		
		//게임 시작
		for (int gameCount = 0; gameCount < 10; gameCount++) {

			//숫자 입력
			System.out.printf("%d번째 숫자를 입력하세요.%n",gameCount+1);
			scanNum = scan.nextInt();
			
			//판정
			if (scanNum == randNum) {
				System.out.println("정답입니다!");
				break;
			} else if (scanNum < randNum) {
				System.out.println(scanNum + "보다 큽니다.");
			} else
				System.out.println(scanNum + "보다 작습니다.");

			//도전횟수 소진시
			if (gameCount == 9) {
				System.out.printf("게임끝! %n정답은 " + randNum + "입니다.");
			}
		}
		scan.close();
	}
}
