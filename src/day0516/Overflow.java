package day0516;

public class Overflow {

	public static void main(String[] args) {
		// 영어로 클래스를 작성할 때 첫글자는 무조건 대문자로 작성
		byte b = 127;
		b++; // 최대값을 넘어서면 최소값으로 나타남 -> 정수의 오버플로우라 부름
		System.out.println(b);
	}

	}


