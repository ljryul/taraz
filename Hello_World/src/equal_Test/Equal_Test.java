package equal_Test;

public class Equal_Test {

	public static void main(String[] args) {
		Object obj1 = "blue";
		Object obj2 = "blue";
		Object obj3 = "red";
		String str1 = "blue";
		String str2 = "100";
		int int1 = 100;
		Object obj4 = "100";
		String str3 = Integer.toString(int1);
		

		if (obj1.equals(obj2)) { // �Ű����� ���� Ÿ���̰� id �ʵ� ���� ���� true ����
			System.out.println("obj1�� obj2�� ������.");
		} else {
			System.out.println("obj1�� obj2�� �������� ����.");
		}

		if (obj1.equals(obj3)) { // �Ű����� ���� Ÿ�������� id �ʵ尪�� �ٸ��Ƿ� false ����
			System.out.println("obj1�� obj3�� ������.");
		} else {
			System.out.println("obj1�� obj3�� �������� ����.");
		}
		
		if (obj1.equals(str1)) { // �Ű����� �ٸ� Ÿ�������� id �ʵ� ���� ���� true ����
			System.out.println("obj1�� str1�� ������.");
		} else {
			System.out.println("obj1�� str1�� �������� ����.");
		}
		
		if (obj4.equals(int1)) { // �Ű����� �ٸ� Ÿ�������� id �ʵ� ���� ���� false ����
			System.out.println("int1�� obj4�� ������.");
		} else {
			System.out.println("int1�� obj4�� �������� ����.");
		}
		
		if (str2.equals(int1)) { // �Ű����� �ٸ� Ÿ���̰� id �ʵ� ���� �ٸ� false ����
			System.out.println("str2�� int1�� ������.");
		} else {
			System.out.println("str2�� int1�� �������� ����.");
		}
		
		if (str2.equals(str3)) { // �Ű����� ���� Ÿ���̰� id �ʵ� ���� ���� true ����
			System.out.println("str2�� str3�� ������.");
		} else {
			System.out.println("str2�� str3�� �������� ����.");
		}
	}
}
