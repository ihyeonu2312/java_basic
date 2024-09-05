package lesson07_oop;

public class MethodOrder {

		public static void main(String[] args) {
			System.out.println("main start");
			MethodEx ex = new MethodEx();
			ex.one(); // 메서드 실행
			System.out.println("main end");
			
		}
}
class MethodEx {
	
	void one() { // 1.
		System.out.println("one start");
		two();
		System.out.println("one end");
		
	}
	void two() { // 2.
		System.out.println("two start");
		three();
		System.out.println("two start");
	}
	void three() { // 3.
		System.out.println("three");
	}
}