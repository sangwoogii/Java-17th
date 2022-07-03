package day0517;

import java.util.Scanner;

public class 값입력받기 {

	public static void main(String[] args) {
		// 콘솔창에서 사용자가 직접 입력하는 방법
		
		// 사용자에게 값을 입력받기 위해 Scanner라는걸 사용
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = s.nextInt();
		// 콘솔창에서 정수를 입력 받아 num1의 값에 집어넣는다는 의미
		
		System.out.print("두 번째 숫자 : ");
		int num2 = s.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		
		// printf 형식 %d : 정수 / %f : 실수 / %s : 문자
		System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		// %d : 정수를 나타내는 형식
		
		s.close(); // 복잡한 식이면 달아주는 것이 좋음
	}

}
