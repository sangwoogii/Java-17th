package day0516;

public class 자동형변환 {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // (int)를 넣지 않아도 되는 것이 자동형변환
		
		System.out.println("intValue : " + intValue);

		int intV = 300;
		byte byteV = (byte)intV;
		
		System.out.println("byteV : " + byteV);
		// 작은타입 -> 큰 타입으로 넣을 땐 생략 가능
		// 큰 타입 -> 작은타입으로 넣을 땐 생략 불가 int -> byte로 변환할 땐 (byte)쓰기
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue : " + intValue); // -> 유니코드로 표시
		
//		byteValue = 65;
//		charValue = byteValue;
//		System.out.println("charValue : " + charValue);
//		 부호코드가 char엔 없기 때문에 식 자체가 맞지 않음.
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f; // float는 숫자맨끝 f도 같이 입력해야함.
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		
		// 형변환 순서 -> ppt자료에 있음

	}

}
