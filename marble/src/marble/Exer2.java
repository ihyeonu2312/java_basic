package marble;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exer2 {
	static Scanner scanner = Scanner(System.in);
	public static void main(String[] args) {
		
		// 1. 달력 출력 (최소 이번달)
		// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력시 심플데이트포맷 파스를 이용해서 해당 연월 달력 출력

		Calendar cal = Calendar.getInstance(); // 2024 9 1
		cal.add(Calendar.MONTH, 1);
		
		// 연, 월, 마지막 날짜, 1일의 요일
		
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH); // 0부터11
		printCal(cal);
		while (true) {
			System.out.println("1. 이전달 2.다음달 3.이전해 4.다음해 5.달 지정");
			switch(Integer.parseInt(scanner.nextInt()) ){
			case 1:
				cal.add(Calendar.MONTH, -1);
				break;
			case 2:
				cal.add(Calendar.MONTH, 1);
				break;
			case 3:
				cal.add(Calendar.YEAR, -1);
				break;
			case 4:
				cal.add(Calendar.YEAR, 1);
				break;
			case 5:
//				System.out.println("연도 입력 > ");
//				cal.set(Calendar.YEAR, scanner.nextInt());
//				System.out.println("월 입력 > ");
//				cal.set(Calendar.MONTH, scanner.nextInt()-1);
				
				System.out.println("연도, 월을 입력해주세요 ex 2024/09 > ");
				cal.setTime(new SimpleDateFormat("yyyy/MM").parse(str));
				break;
			default:
				break;
			}
			printCal(cal);
		
		
//		System.out.println(year);
//		System.out.println(month);

		
	}
	static void printCal(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH)+1));
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(lastDate);
		cal.set(Calendar.DATE, 1);
		System.out.println(startDay);
		
		for(int i = 1 - startDay + 1 ; i <= lastDate ; i++) {
			if(i>0) {
				System.out.printf("%5d", i);
			}
			else {
				System.out.print("     ");
			}
			if(i % 7 == (7 - startDay + 1) % 7) {
				System.out.println();
			}
		}
	}

}