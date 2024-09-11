package lesson11_exception;

public class ExceptionEx05 {

	public static void main(String[] args) {

		System.out.println("main전");
		m1();
		System.out.println("main후");
	}
	static void m1() {
		System.out.println("m1()전");
		try {
			m2();
		} catch(ArithmeticException e) {
			System.out.println("arithmetic 예외처리");
		}
		System.out.println("m1()후");
	}
	static void m2() {
		System.out.println("m2()전");
		try {
			m3();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("index 예외처리");
		}
		finally {
			System.out.println("m2()후 (finally)");
		}
		System.out.println("m2()후");
	}
	static void m3() {
		// 로직수행
		System.out.println(3/0);
	}
}