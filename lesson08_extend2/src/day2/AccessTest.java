package day2;

public class AccessTest {

	public static void main(String[] args) {
		A a = new A();
		a.m(); // default
	}
}
class A{
	void m() {
		System.out.println("A.m()");
	}
}
