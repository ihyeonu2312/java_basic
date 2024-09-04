package day2;

import java.util.Arrays;

public class Exer {
	
	public static void main(String[] args) {
		// 버블 정렬
		
		int[] arr = {2,1,10,7,5};
		
		System.out.println("초기 :: "+Arrays.toString(arr));
		// 회차 반복
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			// 비교 반복
			for(int j = 0 ; j < arr.length - 1 - i ; j++) { // 0,1,2,3
				// 값 비교 후 자리 교환
				if(arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
			System.out.println(i+1+Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	
}
