package lesson06_array;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		
		// 3. 자연수 두개 입력, 두 수의 최대 공약수 구하기
		// ex) 12, 18 >> 6
		// 12의 약수 : 1,2,3,4,6,12
		// 18의 약수: 1,2,3,6,9,18 / 18보다 작은 약수를 통한 나머지 계산
		// 두 수의 공약 수 1,2,3,6 / 6
		
//		int num1 = 38;
//		int num2 = 80;
//		int result = 0;
//		
//		
//		
//			boolean flag = true;
//			while(flag) {
//				int tmp = num1 % num2;
////				System.out.printf("%d %d %d\n", num1, num2, tmp);
//				num1 = num2;
//				num2 = tmp;
//				if (tmp == 0) {
//					flag = false;
//					System.out.println(num1);
		
		int num1 = 12;
		int num2 = 18;
		outer:
		for(int i = num1 ; i <= num1 * num2 ; i+=num1) {
			for(int j = num2 ; j <= num1 * num2 ; i+=num2) {
				if(i == j) {
					System.out.println(j);
					break outer;
				}
				}
		}
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int num = scanner.nextInt();
//		System.out.println("정수를 입력하세요.");
//		int num2 = scanner.nextInt();
//		
//		int max = 0;
//		
//		int result = 0;
//		
//		for( int i = 1 ; i <= num  ; i++) {
//			for ( int j = 1 ; j <= num2 ; j++) {
//				if(num % i == 0 && num2 % j == 0 && i == j) {
//		
//				result = i;
//				}
//			}
//			
//			
//		}
//		System.out.println(result);
		
	}
}
