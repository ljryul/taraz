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
		

		if (obj1.equals(obj2)) { // 매개값이 같은 타입이고 id 필드 값도 동일 true 리턴
			System.out.println("obj1과 obj2는 동등함.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않음.");
		}

		if (obj1.equals(obj3)) { // 매개값이 같은 타입이지만 id 필드값이 다르므로 false 리턴
			System.out.println("obj1과 obj3은 동등함.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않음.");
		}
		
		if (obj1.equals(str1)) { // 매개값이 다른 타입이지만 id 필드 값이 동일 true 리턴
			System.out.println("obj1과 str1은 동등함.");
		} else {
			System.out.println("obj1과 str1은 동등하지 않음.");
		}
		
		if (obj4.equals(int1)) { // 매개값이 다른 타입이지만 id 필드 값이 동일 false 리턴
			System.out.println("int1과 obj4은 동등함.");
		} else {
			System.out.println("int1과 obj4은 동등하지 않음.");
		}
		
		if (str2.equals(int1)) { // 매개값이 다른 타입이고 id 필드 값도 다름 false 리턴
			System.out.println("str2과 int1은 동등함.");
		} else {
			System.out.println("str2과 int1은 동등하지 않음.");
		}
		
		if (str2.equals(str3)) { // 매개값이 같은 타입이고 id 필드 값이 동일 true 리턴
			System.out.println("str2과 str3은 동등함.");
		} else {
			System.out.println("str2과 str3은 동등하지 않음.");
		}
	}
}
