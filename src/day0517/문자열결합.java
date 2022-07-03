package day0517;

public class 문자열결합 {

	public static void main(String[] args) {
		int value = 10 + 2 + 8;
		System.out.println("value : " + value);
		
//		String str1 = 10 + 2 + 8; // String은 문자열인데 숫자가 나열되어있어 에러
//		System.out.println("str1 : " + str1);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);
		// 10과2를 먼저 더하고 문자열을 그대로 붙여줌 -> 12는 숫자 8은 문자
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);
		// 10과 "2"를 먼저 더해서 102 그다음 8을 더해서 1028 -> 102는 문자 8은 숫자
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3); // 1028
		
		String str4 = "10" + (2 + 8); // 괄호가 먼저 있으면 괄호먼저 계산하고 나머지를 계산
		System.out.println("str4 : " + str4); // 1010
		
		String a = "123";
		int b = 30;
		int c = Integer.parseInt(a); // -> a라는 문자열을 숫자로 바꿔줌
		System.out.println(c / b);
		// 문자열을 숫자로 바꿔주는 함수 -> Integer.parseInt(값)
		// 그래서 변수를 하나 더 만들어 주어 값을 보기와 같이 넣어주면 된다.

	}

}
