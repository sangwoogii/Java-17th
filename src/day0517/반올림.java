package day0517;

public class 반올림 {

	public static void main(String[] args) {
		// pi값을 3.141로 나타내고싶음
			float pi = 3.141592f; // float은 뒤에 무조건 접미사 f 붙여주기
			float shortPi = (int) (pi * 1000) / 1000f;
			// 처음에 정수형으로 형변환을 했기 때문에 나타내고 싶은 소수점을 표시하려면
			// 나누는 값을 float형태로 나타내기 위해 접미사 f를 붙여주면됨.
			System.out.println(shortPi);
			
			// Math.round() : 소수점 첫째자리에서 반올림한 값을 반환

			System.out.println("---------------");
			
			double d1 = 0.1f;
			// f는 d로 형변환했기 때문에 근삿값(유사값)으로 계산이됨
			// 그래서 0.1이라는 값이 나오지 않기 때문에 false
			double d2 = 0.1d;
			System.out.println(d1 == d2);
			
			double d3 = 0.1f;
			double d4 = (float)0.1d;
			System.out.println(d3 == d4);
			// 실수와 실수를 비교할 때는 큰숫자에서 작은숫자로 형변환을 시켜 계산을 해주어야함.
			// double이 float보다 큰 범위
			
			System.out.println("---------------");
			
			char x = 'A';
			// char x = 'a';
			System.out.println((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'));
			System.out.println(x >= 'a' && x <= 'z');
			
	}

}
