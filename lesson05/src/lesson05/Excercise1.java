package lesson05;

public class Excercise1 {
	
	public static void main(String[] args) {
		
		// 1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램을 작성하시오.
		
		int sum = 0;
		
		// for문을 이용하여 반복 합계 연산
		for(int i = 0 ; i <= 100; i+=5) {
			sum += i;
			
		}
			
		System.out.println("5의 배수의 합계는 "+sum);
		
	}
	
	
}
