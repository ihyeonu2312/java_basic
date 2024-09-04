package lesson06_array;

public class Exer5 {
	public static void main(String[] args) {
		
		// 5. 회문수 여부 구하기
		// 123321 : 회문수, 12345 : 회문수 아님
		
		int num = 123454321;
		int result = 0;
		int tmp = num;

		
		while(tmp != 0) {
//			System.out.println(tmp);
//			System.out.println(tmp % 10);
			result = result * 10 + tmp % 10;
			tmp /= 10;			
		}
		
		System.out.println(result == num ? "회문수" : "회문수아님");
		System.out.println(result == num);
		
		
		
	}
}
