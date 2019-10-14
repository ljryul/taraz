package fizzBuzz;

/*
 * Title : FizzBuzz ����(1���� 100������ ������ 3�� ����� Fizz, 5�� ����� Buzz, ���� ������� FizzBuzz��� ���)
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
