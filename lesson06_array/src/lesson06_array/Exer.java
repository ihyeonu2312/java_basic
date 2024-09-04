package lesson06_array;

public class Exer {
	public static void main(String[] args) {
		// 1. 모두의 마블
		// 주사위 두개를 굴려서 이동한 거리 계산
		// 더블일 경우 한번 더 굴리기, 총 이동 거리를 출력

		// 2. 두 수를 입력받고서(정수) 두 숫자 사이의 정수 합을 구한다.
		// ex) 3, 10 : 3+4+5+6+7+8+9+10 // 10, 3
		
		// 3. 자연수 두개 입력, 두 수의 최대 공약수 구하기
		// ex) 12, 18 >> 6
		// 12의 약수 : 1,2,3,4,6,12
		// 18의 약수: 1,2,3,6,9,18 / 18보다 작은 약수를 통한 나머지 계산
		// 두 수의 공약 수 1,2,3,6 / 6
		
		// 4. 소수 여부 확인
		// 소수의 조건 : 약수가 1과 자신만 존재
		// ex) 10인 경우 > 소수가 아닙니다.
		
		// 5. 회문수 여부 구하기
		// 123321 : 회문수, 12345 : 회문수 아님
		
		

		
		int sum = 0;
		
		
		while(true) {
			int rand = (int)(Math.random() * 6)+1;
			int rand2 = (int)(Math.random() * 6)+1;
			
			System.out.println(rand+","+rand2);
			
			sum += rand + rand2;
			if(rand != rand2) {
				break;
			}
		}
		System.out.println(sum);	
	}
	
}