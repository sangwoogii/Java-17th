package day0517;

public class 삼항연산자 {

	public static void main(String[] args) {
	
		// 변수 num의 값에 따라 '양수, '음수'을 출력
		
		int num = 10; // 기본적 숫자 선언은 int 사용 (byte, short는 잘 쓰지 않음)
		int num1 = 0;
		
		System.out.println(num > 0 ? "양수" : "음수");
		// 삼항연산자 사용방법 : (? "값1" : (아니면) "값2");
		System.out.println(num1 > 0 ? "양수" : (num1 < 0 ? "음수" : "0"));
		//                  조건       true값        false값
		
		
		// 점수를 이용하여 등급 표시하기
		// 점수가 90점 이상이면 'A', 80점 이상 'B', 나머지 'C' 출력
		int score = 90;
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C');
		
		System.out.println(score + "점은 " + grade + "등급 입니다.");
	} 
 
}
