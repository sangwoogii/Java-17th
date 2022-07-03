package day0517;

import java.util.Scanner;

public class 대소문자확인 {
	public static void main(String[] args) {
		
		// 영문자를 입력받아 문자가 대문자이면 소문자로 출력
		// 소문자면 대문자로 출력
		// 그 외의 문자이면 '입력데이터 오류'라고 출력
		
		Scanner s = new Scanner(System.in);
		System.out.println("영문자 1글자 입력 >");
		
		String word = s.next(); // 문자는 next 그대로 입력
		
		char c = word.charAt(0);
		
		// 아스키코드
		// A ~ Z : 65 ~ 90까지 대문자
		// a ~ z : 97 ~ 122까지 소문자
		
		if (c >= 65 && c <= 90) {
			System.out.println(word.toLowerCase());
		} else if (c >= 97 && c <= 122) {
			System.out.println(word.toUpperCase());
		} else {
			System.out.println("입력데이터 오류");
		}
		
		s.close();
	}
}
