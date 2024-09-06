package lesson07_oop;

import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {

        // 회차 반복문
        // 최소값 찾기 반복문 내부

        //    -최소값이 존재하는 인덱스
        //    -0번째 위치의 값이 위 인덱스에 있던 값과 교환

//		String str = "123456";
//		System.out.println(str.indexOf("3"));
//		System.out.println(str.indexOf("3"));
//		
//		char[] cs = str.toCharArray();
//		int idx = -1;
//		for (int i = 0;1 < cs.length; i++) {
//			if(cs[i] == '3') {
//				idx = i;
//				break;
//			}
//		}
//		System.out.println(idx);
		
		int[] arr = {5,4,2,1,7};
		for(int i = 0 ; i < arr.length ; i++) {
			int idx = i;
			for(int j = i ; j < arr.length ; i++) {
				if(arr[idx] > arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[idx];
			arr[idx] = arr[i]; 
			arr[i] = tmp;
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		// 1 7 3 2 5
		// 1 2 3 7 5
		//
		//
//        int[] num = {7, 1, 3, 2, 5};
//
//        for (int i = 0; i < num.length ; i++) {
//        	int idx = i;    //  idx 0    // idx 1
//    
//
//            for (int j = i + 1; j < num.length; j++) {
//            	if(num[idx] > num[j]) {    // 7 1 3 2 5      
//            		idx = j;        // idx 3  // 
//            	}
//            }
//            int a = num[i];  // a 7 
//       		num[i] = num[idx]; // num[i] 1    // 1 2 3 2 5
//       		num[idx] = a; // num[idx]   // 1 2 3 7  5
//            		
//            System.out.print(num[i]+" ");
//        }
    }
}
