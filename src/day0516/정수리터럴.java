package day0516;

public class 정수리터럴 {

	public static void main(String[] args) {
		// 표현법 : 2진수 -> 0b, 8진수 -> 0, 10진수 -> 그냥작성, 16진수 -> 0x를 붙힘
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 1234; // 10진수
		int var4 = 0xb3; // 16진수
		
		char ch = '\u0041'; // 유니코드
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		System.out.println("ch : " + ch);
		
		byte b1 = 127; // byte는 -128 ~ 127까지의 범위 128을 넣으면 에러
		System.out.println("b1 : " + b1);

	}

}
