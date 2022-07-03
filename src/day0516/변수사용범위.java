package day0516;

public class 변수사용범위 {
	public static void main(String[] args) {
		
		int v1 = 15;
		
		if (v1 > 10) { // js if문과 사용방법 동일
			int v2; // 만약 v1이 10보다 크다면 v2이라고 변수 저장	
			v2 = v1 - 10; // v2의 값은 v1에서 10을 뺀 나머지
			System.out.println("v1 : " + v1 + ", v2 : " + v2);	
		}
//		System.out.println("v1 : " + v1 + ", v2 : " + v2);
		// if문 밖에서 값을 나타내고 싶으면 int v2이라는 변수를
		// if문 밖에다 선언하고 초기값을 0으로 설정해주어야한다. -> int v2 = 0;
		
////		int num1 = 0;
////		if (true) {
////			int num2 = 0;
////			if (true) {
////				int num3 = 0;
////				num1 = 1;
////				num2 = 2;
////				num3 = 3;
////				num1 = num2 + num3;
////			}
//		}
		
	}
}
