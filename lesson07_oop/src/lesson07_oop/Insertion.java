package lesson07_oop;

import java.util.Arrays;

public class Insertion {
	
	public static void main(String[] args) {
		
		// 작은 인덱스에서 부터 시작 (회차)
		
		// 현재 위치의 인덱스 미만의 값들과 대소 비교
		//	- 조건 검수 후 해당 위치에 삽입 예정
		//	- 해당 위치에서 부터 한 칸씩 우측으로 이동
		//	- 에정 위치에 해당 값 대입
		
		int[] arr = {3,5,4,1,2};
		
		// 3번 인덱스의 값을
		// 맨 앞으로 보내기
		
		// 3 5 4 1 2
		// 3 5 1 4 2
		// 3 1 5 4 2
		// 1 3 5 4 2
		
		
		// 3 5 4 1 2
		// 3 4 5 1 2
		// 3 4 5 1 2
		
		for(int j = 1; j < arr.length ; j++) {
			System.out.println(j + "회차");
			for(int i = j ; i > 0 ; i--) {
				if(arr[i] < arr[i-1]) {
					int tmp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tmp;
		}
		System.out.println(Arrays.toString(arr));
		
			
			}
		
		}
	}
}