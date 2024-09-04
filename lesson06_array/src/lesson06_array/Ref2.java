package lesson06_array;

public class Ref2 {
	public static void main(String[] args) {
		String str1 = "ABCD"; // 0x300
		String str2 = "ABCD"; // 0x300
		String str3 = new String("ABCD"); // 0x400
		
		System.out.println(str1.charAt(2));
		System.out.println(str2.charAt(2));
		System.out.println(str3.charAt(2));
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		
	}
}
