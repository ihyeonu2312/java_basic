package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer3 {
	
	public static void main(String[] args) {
	
		// 2. Scanner 사람 이름을 입력 받기
		// 입력 글자 중 q를 입력하면 입력 종료
		// 사람 이름들을 문자열 배열 만들어서
		// 프로그램 종료 직전 확인
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Character.BYTES);

		
		Scanner scanner = new Scanner(System.in);
		String[] strings = new String[3];
//		String[] temp = {"abc", "def"};
//		temp = Arrays.copyOf(temp, temp.length*2);
//		System.out.println(Arrays.toString(temp));
		
		for( int i = 0 ; ; i++ ) {
			System.out.print("이름을 입력하세요 : ");
			String str = scanner.nextLine();
			if(str.equals("q")) {
				System.out.println("bye");
				break;
			}
			// 배열 늘리기
			if(strings.length == i) {
				System.out.println("문제 발생 직전");
				strings = Arrays.copyOf(strings, strings.length * 2 );
			}
			strings[i] = str;
		}
		for(String s : strings) {
			if(s == null)break;
			System.out.println(s);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
