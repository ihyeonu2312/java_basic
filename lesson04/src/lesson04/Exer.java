package lesson04;

public class Exer {

	public static void main(String[] args) {
		// +=: 우측항의 값을 좌항값에 더하여 좌항에 대입
		// a += b ; // a = a+b 
		
		System.out.println(7 - 1 * 20 / 5);
		
		int colorPen = 5 * 12;
		int studentCount = 27 ;
		
		int divColorPen = colorPen / studentCount;
		System.out.println(divColorPen);
		
		int remainColorPen = colorPen % studentCount;
		System.out.println(remainColorPen);
	
		int age = 5;
		int height = 120;
		boolean parent = true;
		boolean hearchDease = true;
		
		boolean result = (age >= 6 && height >= 120) || (height >= 120 && parent) && !hearchDease;
		
		//result height >= 120 && (age >= 6 || parent) && !hearchDease;
		
		System.out.println(result);
		
		int year = 2400;
		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		System.out.println(leapYear);
		
		int price = 187000;
		int oman = price / 50000;
		int ilman = price % 50000 / 10000;
		int ochun = price % 10000 / 5000;
		int ilchun = price % 5000 / 1000;
		
		System.out.println("5만원권 :" + oman + "장");
		System.out.println("1만원권 :" + ilman + "장");
		System.out.println("5천원권 :" + ochun + "장");
		System.out.println("1천원권 :" + ilchun + "장");
		
		int number = 1234;
		System.out.println(number / 100 * 100);
		
		
	}

}
