package fizzBuzz;

/*
 * Title : FizzBuzz 문제(1부터 100까지의 숫자중 3의 배수는 Fizz, 5의 배수는 Buzz, 둘의 공배수는 FizzBuzz라고 출력)
 * Author : ljryul
 */

public class FizzBuzz {

	public static void main(String[] args) {
		for(int fbNum = 1; fbNum <= 100; fbNum++) {
			if(fbNum % 15 == 0) {
				System.out.println(fbNum+" FizzBuzz");
			} else if(fbNum % 3 == 0) {
				System.out.println(fbNum+" Fizz");
			} else if(fbNum % 5 == 0) {
				System.out.println(fbNum+" Buzz");
			} else System.out.println(fbNum);
		}
	}
}
