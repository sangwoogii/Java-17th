package day0516;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class는 속성(필드) : 명사 , 메서드(함수) : 동사 가 올 수 있음.
		// 필드를 선언하는 것 -> 변수
		/*
		 변수 명명 규칙
		 1. 대소문자가 구분, 길이 제한없음
		 2. 예약어를 사용할 수 없음
		 3. 숫자로 시작할 수 없음
		 4. 특수문자는 '_'와 '$'만 허용
		  */
		int a; //a라는 이름의 변수선언
		
		a = 10;
		System.out.println(a);
		
		a = 20;
		System.out.println(a); //
		
		System.out.println("-------------");
		
		int x = 10, y;
		
		y = x;
		
		y = y + 20;
		System.out.println(x);
		System.out.println(y); //
		
		System.out.println("-------------");
		
		// 시간 계산하기
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour * 60) + minute; // 3시간 5분을 분으로 나타내기
		System.out.println("총 " + totalMinute + "분");
				
		// 총 185분으로 나타내기
		
		// 기본형 8가지 + 문자열 클래스 String
		// 기본형 변수 8가지 (char, byte, short, int, long, float, double, boolean)
		// 기본형 -> 실제 값을 저장
		// 자료의 크기 : 타입마다 다름
		
		// 참조형 - 기본형을 제외한 나머지 (String, System 등)
		// 객체의 주소를 저장
		// 자료의 크기 : 4byte, 주소값이 16진수로 다루어짐
		
		// 자바 최소단위 : byte
		
		// E : 지수부 M : 가수부 -> ppt자료
		
		System.out.println("-------------");
		
		int b = 5;
		int c = 3;
		
		System.out.println("b : " + b + ", c : " + c);
		
		// b와 c의 값을 바꾸기 -> 변수를 하나 더 만들어서 값을 집어넣기
		int temp = b;
		b = c;
		c = temp;
		System.out.println("b : " + b + ", c : " + c);

	}

}
