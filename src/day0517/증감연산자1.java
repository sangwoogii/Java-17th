package day0517;

public class 증감연산자1 {

	public static void main(String[] args) {
		
		int i = 5, j= 0;
		
		j = i++;
		System.out.println("j = i++ 실행 후 i = " + i + ", j = " + j);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j = i++ 실행 후 i = " + i + ", j = " + j);
		
		// 비트연산자
		byte a = 10;
		System.out.println(~a);
	}

}
