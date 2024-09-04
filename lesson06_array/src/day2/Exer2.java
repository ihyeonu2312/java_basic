package day2;

public class Exer2 {
	public static void main(String[] args) {
		// 1. 지폐 및 동전 세기
		int money = 123456;
		int[] units = {50000, 10000, 5000, 1000, 500, 100, 10, 5, 1};
		int[] counts = new int[10];
		// {2,2,0,3,0,4,1,0,1,1}
		
		
		int a = money / units[0];
		int b = money % units[0] / units[1];
		int c = money % units[1] / units[2];
		int d = money % units[2] / units[3];
		int e = money % units[3] / units[4];
		int f = money % units[4] / units[5];
		int g = money % units[5] / units[6];
		int h = money % units[6] / units[7];
				
		
				
		System.out.println(g);
		
		for( int i = 0 ; money < units[0] ; i++ ) {
			money -= units[0];
			if(money == 0 ) {
			}
			System.out.println(i);
		
		}
		
		// 2. Scanner 사람 이름을 입력 받기
		// 입력 글자 중 q를 입력하면 입력 종료
		// 사람 이름들을 문자열 배열 만들어서
		// 프로그램 종료 직전 확인
		
		
		
		
	}
}
