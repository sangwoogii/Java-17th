package day0517;

import java.util.Scanner;

public class if문2 {

	public static void main(String[] args) {
		
		// 사용자로부터 두 개의 정수를 입력받아 -> 입력받아 : Scanner 사용
		// 둘 중 큰 수를 출력
		
		Scanner s = new Scanner(System.in);
		
//		System.out.print("첫 번째 정수 : ");
//		int num1 = s.nextInt();
//		
//		System.out.print("두 번째 정수 : ");
//		int num2 = s.nextInt();
//		
//		if (num1 > num2) {
//			System.out.println(num1);
//		} else if (num1 < num2) {
//			System.out.println(num2);
//		}
		
		// s.next() : 공백이 있기 전까지만 리턴시키는 것.
		// s.nextLine() : 엔터치기 전까지 리턴시키는 것.
		String tmp = s.nextLine();
		System.out.println(tmp);
		
		String tmp2 = s.next();
		System.out.println(tmp2);
		
		s.close();	
	}
	
}
