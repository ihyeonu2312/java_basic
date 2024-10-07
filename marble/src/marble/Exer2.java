package marble;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exer2 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance(); // 2024 9 1
		cal.set(Calendar.DATE, 1);
		printCal(cal);
		while (true) {
			System.out.println("1. 이전달 2. 다음달 3. 이전해 4. 다음해 5. 달 지정(검색)");
			switch (Integer.parseInt(scanner.nextLine())) {
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

				System.out.println("연도,월을 입력해주세요 ex) 2024/09 > ");
				String str = scanner.nextLine();
				cal.setTime(new SimpleDateFormat("yyyy/MM").parse(str));
				break;
			default:
				break;
			}
			printCal(cal);
//			Queue<String> queue = new LinkedList<String>();
		}
	}

	static void printCal(Calendar cal) {

		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1 - startDay + 1; i <= lastDate; i++) {
			if (i > 0) {
				System.out.printf("%4d", i);
			} else {
				System.out.print("    ");
			}
			if (i % 7 == (7 - startDay + 1) % 7) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.print("          ");
		System.out.print(cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH) + 1));
		System.out.println("(날씨)");
		System.out.println();
		System.out.print("          ");
		System.out.println("오늘의 운세");
		System.out.print("    ");
		System.out.println("");
		System.out.println();
		System.out.print("             ");
		System.out.println("가계부");
		System.out.println("지출 : 경조사비 20,000");
		System.out.println("수입 : 보람3조 알바 20,000");

		System.out.println("잔액 : 20,000");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}
}
