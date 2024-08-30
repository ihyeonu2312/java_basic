package lesson04;

public class OpEx7 {

	public static void main(String[] args) {
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		//
		int num = 71;
		// 짝수, 홀수
		String pass2 = num %2 == 0 ? "짝수" : "홀수";
		System.out.println(pass2);
		
		String s = "ABCD";
		s += "ㄱㄴㄷㄹ\n";
		s += "1234";
		System.out.println(s);
		
		byte b = Byte.MAX_VALUE;
		System.out.println(b);
	
		char ch = 'A';
		char ch2 = (char)(ch + 1);
		
		// 산술 형 상승 : int보다 작은 숫자 타입을 산술 연산 시 int
		System.out.println(ch2);
		
		//int > byte, short, char
	
		byte b1 = 1;
		byte b2 = (byte)(b + b1);
		System.out.println(b2);
		
		int i = 300;
		byte b3 = (byte)i;
		
		
		System.out.println(i); // 1 0010 1100
		System.out.println(b3); // 0010 1100 까지(byte)
		
		// '0':48, 'A':65, 'a':97, '가':44032
		System.out.println((int)'가');
		
		//unicode에 완성형 한글의 글자 갯수 구하기
		System.out.println('Z' - 'A' + 1);
		System.out.println('힣' - '가' + 1);
		
		System.out.println("=================================");
			
		int cnt = 0;
		for(ch = '가' ; ch < '까' ; ch++) {
			System.out.print(ch);
			cnt++;
			
		}
		System.out.println(cnt * 19);
		
		// 2^16 65536 (0~65536)
		
		// 사과 123개 상자당 10개씩 들어갑니다.
		// 몇개의 상자가 필요합니까?
		
		int apple = 139;
		int box = 10;
		
		//	int result = apple % box == 0 ? apple / box : apple / box +1;
		int result = (apple + 9) / box;
		System.out.println(result);
		
		// 소수점 자르기 (반올림) 소수점 셋째 자리로
		// 3.141592 
		// 3.142
		double pi = 3.141592;
		System.out.println(pi * 1000);
		System.out.println((int)(pi * 1000 + 0.5) /1000d);
		
		
		
		
		
		
		
		
		
	}

}
