package rockScissorsPaper;

import java.util.Random;

/*
 * Title : ���� ������ �̿��� ����������
 * Author : ljryul
 */

public class RockScissorsPaper {

	public static void main(String[] args) {
		
		int randNum1;		//���� 1
		int randNum2;		//���� 2
		int min = 1;		//���� �ּڰ�
		int max = 100;		//���� �ִ�
		Random rand = new Random();
		String com1;		//�÷��̾� 1
		String com2;		//�÷��̾� 2
		
		//���� ���� ����
		randNum1 = rand.nextInt(max - min + 1) + min;		
		randNum2 = rand.nextInt(max - min + 1) + min;
		
		//������ ���� �ָ� ���� �� ����(1 ~ 29 : ����, 30 ~ 59 : ����, 60 ~ 100 : ��)
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
		 * ����׿� ���� Ȯ�� 
		 * System.out.println(randNum1 + ", " + randNum2);
		*/
		
		//�÷��̾ ���� ���
		System.out.println("com1 = " + com1 + ", com2 = " + com2);
		
		//���������� ����
		fight(com1, com2);
	}

	//����������
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
