package lesson04;

public class OpEx6_1 {

	public static void main(String[] args) {
		String s = Integer.toBinaryString(10);
		System.out.printf(" %032d\n", Integer.parseInt(s));
		String s2 = Integer.toBinaryString(6);
		System.out.printf(" %032d\n", Integer.parseInt(s2));
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		System.out.println(max);
		
		System.out.println(min);
		
		System.out.println(max + min);

		System.out.println("0" + Integer.toBinaryString(max));

		System.out.println(Integer.toBinaryString(min));
		
		System.out.println(max + 1);
	
		// integer.toBinaryString(int) : String
		// intger.parseInt(String) : int
		

				
		
	}

}
