package day0517;

public class 연산자종합 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65;
		
		System.out.println(1 + x << 33);
		// 쉬프트연산자 -> 위의 결과값을 33번 이동한다는 의미
		// 3 << 33의 값 -> 2진수로 나타내면 0011을 33번 이동
		// int는 32bit -> 한바퀴 돌아서 맨 처음 값에서 한칸 이동
		// 그러면 0110가 되서 값이 6이 나옴
		
		System.out.println(y >= 5 || x < 0 && x > 2);
		// ||보다 &&를 먼저 계산
		
		System.out.println(y += 10 - x++);
		// y = y + (10 - x++) 먼저 계산
		// y = y = 8 -> 13
		
		System.out.println(x += 2);
		// 바로 위에 x++때문에 3으로 바꼇기 때문에 값은 5
		
		// ! : 논리부정연산자 (true를 false로 f를 t로 바꾸어주는 것)
		System.out.println(! ('A' <= c && c <= 'Z'));
		//					!    (t            t) -> f
		
		System.out.println('C' - c);
		// 문자C는 67 변수c는 65 두 값을 빼면 2
		
		System.out.println(c+1); 
		// 변수 c는 문자 'A'의 값 = 65 + 1 = 66
		// 문자는 숫자로 형변환 가능하기 때문에
		// 이항연산자 : 연산을 수행할 때 연산자를 '피연산자스택' 이라는 장소에 보관
		
		System.out.println(++c);
		// ++ 이런식으로 사용하는건 단항연산자 : int보다 작은 타입도 형변환을 하지 않음.
		
		System.out.println(c++);
		// c++의 값이 B가 되는 이유는 바로 위에서 이미 증가를 했기 때문에 B가 나옴
		
		System.out.println(c);
		// 그냥 c의 값도 바로 위의 식에서 식이 증가했기 때문에 값이 C가 됨
	}

}
