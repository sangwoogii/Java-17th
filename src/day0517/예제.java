package day0517;

public class 예제 {

	public static void main(String[] args) {
		// 1. 변수 num에는 456이라는 값이 저장되어 있음.
		// 변수의 백의 자리 이하를 버리는 코드를 작성하시오.
		// 만약 num이 456이라면 400이 되고, 111이라면 100으로 출력
		
		int num = 456;
		int num1 = 111;
		
		System.out.println(num / 100 * 100);
		System.out.println(num1 / 100 * 100);

		// 2. 만약 사과가 123개가 있고 하나의 바구니에는 10개의 사과를 담을 수 있다면
		//    바구니는 13개가 필요함
		//    사과를 담는데 필요한 바구니의 수를 구하시오.
		int apples = 123;
		int box = 10;
		
		int num2 = apples / box + (apples % box > 0 ? 1 : 0);
		System.out.println("바구니 수 : " + num2);
		
		// 3. 화씨(F)를 섭씨(C)로 변환하시오.
		// 변환 공식 : C = 5 / 9 * (F - 32)
		// 단, 결과는 소수점 셋째자리에서 반올림해서 표시
		// (Math.round() 사용하지 말 것)
//		int f = 100;
//		float c = (int) ((5 / 9f * (f - 32)) * 100) / 100f;
		
		int f = 100;
		float c = (int) ((5 / 9f * (f - 32)) * 100 + 0.5) / 100f;
		
		System.out.println(c);
	}

}
