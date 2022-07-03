package day0517;

public class if문 {

	public static void main(String[] args) {
		String str = "C";
		char ch = 'c';
		
		System.out.println((str == "c") || (str == "C"));
		System.out.println((str.equals("c")) || str.equals("C"));
		System.out.println(str.equalsIgnoreCase("c"));
		// 문자열을 비교하는 방법 3가지
		
		// Java에선 안쓰는 메모리는 알아서 정리해줌
		
		char num = '4';
		System.out.println(num >= '0' && num <= '9');
		System.out.println(!(num >= '0' && num <= '9'));

//		String str1 = "3"; // String 사용시 문자열이기 때문에 큰따옴표 사용
		// charAt(인덱스번호) : 문자열에서 인덱스번재의 문자를 반환하는 것, 0번째부터 시작
		if (str != null && !str.equals("")) {
			ch = str.charAt(0);
		}
		System.out.println(ch);
		System.out.println("hello".charAt(2));
		// hello -> 01234 순서대로 .charAt(2) -> 2번째 글자를 반환
		
		// 문자 '3'을 숫자로 바꾸고 싶음.
		System.out.println('3' - '0');
		// 아스키코드에서 문자 '3'은 51 '0'은 48 고로 51-48 = 3이 숫자로 바뀌게된다.
	}

}
