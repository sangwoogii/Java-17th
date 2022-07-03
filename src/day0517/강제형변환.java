package day0517;

public class 강제형변환 {

	public static void main(String[] args) {
		
		int intValue = 10;
		byte byteValue = (byte)intValue;
		// byte값이 int보다 작기 때문에 (byte)를 쓰지 않으면 에러가 뜸 ->  이것이 형변환
		// 이렇게 형변환 하는 과정을 '캐스팅' 이라고 함.
		System.out.println(byteValue);
		
		intValue = 65; // 위에서 변수를 선언해서 int를 다시 쓰지 않아도됨. / 아스키코드
		char charValue = (char)intValue;
		// char를 쓰면 숫자를 문자로 변환해줌
		System.out.println(charValue);
		
		intValue = 44032; // 유니코드
		charValue = (char)intValue;
		System.out.println(charValue);
		// 숫자로도 문자를 화면에 출력할 수 있다는 것을 보여줌.
		
		long longValue = 500;
		intValue = (int)longValue; // int : 4byte / long : 8byte
		System.out.println(intValue);
		
		double doubleValue = 3.14; // double은 실수
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}

}
