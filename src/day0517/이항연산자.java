package day0517;

public class 이항연산자 {
		public static void main(String[] args) {
			
//			byte a = 10;
//			byte b = 30;
//			
//			byte c = a * b;
//			System.out.println(c);
//			a*b는 300이기 때문에 byte가 넘어서 에러
			
//			byte d = 10;
//			byte e = 30;
//			
//			byte f = (byte)d * e;
//			d는 바이트인데 e는 int이기 때문에 에러
//			System.out.println(f);
			
			byte g = 10;
			byte h = 30;
			
			byte i = (byte)(g * h); // 정수의 오버플로우 발생
			// byte는 -128 ~ 127까지의 범위를 가지기 때문에 오버플로우 발생
			// 내가 원하는 값이 나오지 않음.
			System.out.println(i);
			
			System.out.println("----------------------");
			
			int num1 = 1000000;
			int num2 = 2000000;
			// int의 값은 약 20억, num1과2를 곱하면 20억이 넘어버리기 때문에
			// 정수의 오버플로우가 발생함. -> 값이 이상하게나옴
			long total = num1 * num2;
			System.out.println(total);
			
			int num3 = 1000000;
			int num4 = 2000000;
			
			long total2 = (long)num3 * num4;
			// num3과 4에 각각 long으로 형변환을 시켜도 되지만 이항연산자로 인해
			// 둘 중에 하나만 long으로 형변환 시켜도 long값으로 계산이됨.
			System.out.println(total2);
			
//			int num5 = 1000000;
//			int num6 = 2000000;
			
			long total3 = 20000000000000L;
			// long타입은 접미사가 없으면 int타입으로 나타나기 때문에 '접미사 L'을 붙여주어야함.
			System.out.println(total3);
			
			int d = 1000000 * 1000000 / 1000000;
			// 곱하기를 해서 범위가 이미 벗어낫기 때문에 나누기를 해도 결과값이 이상하게나옴.
			int e = 1000000 / 1000000 * 1000000;
			// 나누기를 먼저 하면 값의 범위가 벗어나지 않기 때문에 결과값이 제대로 나옴.
			System.out.println(d);
			System.out.println(e);

			System.out.println("----------------------");
			
			char c1 = 'A'; // 한글자를 사용할 땐 ''
			char c2 = 'A' + 1; // 문자 + 정수 -> int의 값을 가짐
			char c3 = ++c1;
			char c4 = (char)(c2 + 1);
			// 문자+정수는 int이기 때문에 int값이 char값보다 크기 때문에
			// char로 형변환을 시켜주어야 함.
			
			System.out.println("c1 : " + c1);
			System.out.println("c2 : " + c2);
			// 문자는 숫자형태로 저장이 가능하기 때문에 산술연산이 가능함
			System.out.println("c3 : " + c3);
			System.out.println("c4 : " + c4);
			
			int in1 = 'B' - 'A';
			int in2 = '2';
			int in3 = '2' - '0';
			System.out.println(in1);
			// 아스키코드로 치면 66-65이기 때문에 결과값은 1이 나옴
			System.out.println(in2);
			// 문자2는 아스키코드로 50의 값을 가지기 때문에
			System.out.println(in3);
			// 아스키코드 문자2의 50과 문자0의 48을 빼서 2라는 값이 나옴
		}
}
