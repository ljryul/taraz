package rockScissorsPaper;

import java.util.Random;

/*
 * Title : 난수 생성을 이용한 가위바위보
 * Author : ljryul
 */

public class RockScissorsPaper {

	public static void main(String[] args) {
		
		int randNum1;
		int randNum2;
		int min = 1;
		int max = 100;
		Random rand = new Random();
		String com1;
		String com2;
		
		randNum1 = rand.nextInt(max - min + 1) + min;
		randNum2 = rand.nextInt(max - min + 1) + min;
		
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
		
		System.out.println(randNum1 + ", " + randNum2);
		System.out.println("com1 = " + com1 + ", com2 = " + com2);
		
		fight(randNum1,randNum2);
		
	}

	private static void fight(int a, int b) {
		if(a < b && b < 60) {
			System.out.println("com1 is win");
		} else if(a < b && b > 60) {
			System.out.println("com2 is win");
		} else if(a > b && a < 60) {
			System.out.println("com1 is win");
		} 
	}


}
