package rockScissorsPaper;

import java.util.Random;

/*
 * Title : 난수 생성을 이용한 가위바위보
 * Author : ljryul
 */

public class RockScissorsPaper {

	public static void main(String[] args) {
		
		int randNum1;		//난수 1
		int randNum2;		//난수 2
		int min = 1;		//난수 최솟값
		int max = 100;		//난수 최댓값
		Random rand = new Random();
		String com1;		//플레이어 1
		String com2;		//플레이어 2
		
		//난수 범위 지정
		randNum1 = rand.nextInt(max - min + 1) + min;		
		randNum2 = rand.nextInt(max - min + 1) + min;
		
		//난수에 따른 주먹 가위 보 지정(1 ~ 29 : 바위, 30 ~ 59 : 가위, 60 ~ 100 : 보)
		if(randNum1 < 30) {
			com1 = "Rock";
		} else if(randNum1 < 60) {
			com1 = "Scissors";
		} else {
			com1 = "Paper";
		}
		
		if(randNum2 < 30) {
			com2 = "Rock";
		} else if(randNum2 < 60) {
			com2 = "Scissors";
		} else {
			com2 = "Paper";
		}
		
		/*
		 * 디버그용 난수 확인 
		 * System.out.println(randNum1 + ", " + randNum2);
		*/
		
		//플레이어가 낸것 출력
		System.out.println("com1 = " + com1 + ", com2 = " + com2);
		
		//가위바위보 실행
		fight(com1, com2);
	}

	//가위바위보
	private static void fight(String com1, String com2) {
		if(com1.equals(com2)) {
			System.out.println("Draw");
		} else if(com1 == "Rock" && com2 == "Scissors") {
			System.out.println("com1 is win");
		} else if(com1 == "Rock" && com2 == "Paper") {
			System.out.println("com2 is win");
		} else if(com1 == "Scissors" && com2 == "Paper") {
			System.out.println("com1 is win");
		} else if(com1 == "Scissors" && com2 == "Rock") {
			System.out.println("com2 is win");
		} else if(com1 == "Paper" && com2 == "Rock") {
			System.out.println("com1 is win");
		} else if(com1 == "Paper" && com2 == "Scissors") {
			System.out.println("com2 is win");
		}
	}
}
