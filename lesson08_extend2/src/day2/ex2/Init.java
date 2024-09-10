package day2.ex2;

public class Init {
	
	private static Init init = new Init();
	public Init() {
		System.out.println("초기화");
	}
	
	public static void main(String[] args) {
//		new Init();
//		main(args);
//		System.out.println(fact(6));
//	int result =1;
//	for( int i = 2 ; i <= 6 ; i++ ) {
//		result *= i;
//	}
//	System.out.println(result);
	}
	
	static int fact(int i) {
		if( i == 1 ) {
			return 1;
			
		}
		return fact( i - 1 ) * i;
	}
}
