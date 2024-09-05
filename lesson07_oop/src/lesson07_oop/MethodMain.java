package lesson07_oop;

public class MethodMain {
	public static void main(String[] args) {
		System.out.println(Param.min(1,2,3,4,5,6));
		System.out.println(Param.min());// 길이가 0인 배열
		System.out.println(Param.min(new int[] {3,4,5}));// 길이가 0인 배열
	
		System.out.printf("%d", 123, 12, 1, "가나다라");
	
	}
}

class Param {
	int add(int a, int b) {
		return a + b;
	}
	
	static int add2(int a, int b) {
		return a + b;
	} 
	
	static int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			return -1;
		}
		// 최대값 처리
		int ret = arr[0];
		for(int i : arr) {
			if(ret < i) {
				ret = i;
			}
		}
		return ret;
	}
	// 가변 인자
	static int min(int... num) {
		if(num == null || num.length == 0) {
			return -1;
		}
		// 최대값 처리
		int ret = num[0];
		for(int i : num) {
			if(ret > i) {
				ret = i;
			}
		}
		return ret;
	}
}
		//		Param p = new Param();
		// argument
		// parameter
		
//		int a = 10;
//		int result = p.add(10, 20);
//		System.out.println(result);
//		System.out.println((p.add(30, 40)));
//		System.out.println(p.add(50, (p.add(30, 40))));
//		System.out.println(new Param().add(40, 50));
//		int b = Param.add2(10, 20);
//		System.out.println(b);
//		int c = Param.max(new int[] {10, 20, 5, 30, 1, 4, 50});
//		Param.max(new int[] {});
//		Param.max(null);
//		System.out.println(c);
//		System.out.println(Param.max(new int[] {}));
//		System.out.println(Param.max(null));
	
					//0,1,2,3
//		String str = "가나다라";
//		String s1 = str
//				.substring(0,2)
//				.concat("AB")
//				.substring(1,3);
//		System.out.println(s1);
//		System.out.println(Param.min(1,2,3,4,5,6));