package lesson06_array;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		
		
		
		// 2. 두 수를 입력받고서(정수) 두 숫자 사이의 정수 합을 구한다.
		// ex) 3, 10 : 3+4+5+6+7+8+9+10 // 10, 3
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = scanner.nextInt();
		System.out.println("정수를 입력하세요.");
		int num2 = scanner.nextInt();
		int sum = 0;
		
//		for ( int i = num ; i <= num2 ; i++) {
//				sum += i;
//		}
//				 for ( int i = num2 ; i <= num ; i++) {
//					 sum += i;
//					 
//				 }
		if (num > num2) {
				int tmp = num;
				num = num2;
				num2 = tmp;
				
		}
		
		for(int i = num ; i <= num2 ; i++ ) {
			sum += i;
		}
		
			System.out.println(sum);
		} 
			
	
	
	}

