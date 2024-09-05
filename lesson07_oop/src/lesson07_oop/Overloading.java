package lesson07_oop;

public class Overloading {

	public static void main(String[] args) {
		new Operator().multiply(10, 20);
// Stack<E>k


	}
	
}

class Operator {
	int multiply(int x, int y) {
		return x * y;
	}
	int multiply(int z) {
		return z * z;
	}
	double multiply(double x, int y) {
		return x * y;		
	}
	double multiply(int x, double y) {
		return x * y;		
	}
	
}