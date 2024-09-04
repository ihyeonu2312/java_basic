package lesson06_array;

public class Exer4 {
	
	public static void main(String[] args) {
		
		// 4. 소수 여부 확인 (prime number)
		// 소수의 조건 : 약수가 1과 자신만 존재
		// ex) 10인 경우 > 소수가 아닙니다.
		
		int num = 11;
		boolean flag = true;
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		System.out.println(num + "는 " + (flag ? "소수" : "소수 아님"));
		

	}
}
