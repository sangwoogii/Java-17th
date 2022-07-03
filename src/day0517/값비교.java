package day0517;

public class 값비교 {

	public static void main(String[] args) {
		// String에 대해서 좀 더 알아보기
		
		String s1 = "str";
		String s2 = "str";
		String s3 = new String("str");
		String s4 = new String("str");
		
		// == 연산자는 값의 주소로 비교 즉, equals로 비교
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); // String을 사용할 땐 equals 사용
		System.out.println("--------------");
		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println("--------------");
		
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		System.out.println("--------------");
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
