package lesson12_api;

public class WrapperEx {

	public static void main(String[] args) {
		
		Integer i1 = 10;
		Integer i2 = new Integer(20); // boxing
		Integer i3 = new Integer("30"); // boxing
		
		System.out.println(i1 + i2 + i3); // unboxing
		
		Integer i4 = 20;
		
		System.out.println(i2 == i4); // false
		System.out.println(i2.equals(i4)); // true
		System.out.println(i2.intValue() == i4.intValue()); // true
		
		Long l1 = 10L;
//		long l1 = 10;
		Long l2 = l1.longValue();
		
		Character c1 = 65; // 'A'
		
		// 문자열 > wrapper 객체
		l2 = Long.valueOf("10");
		l2 = new Long("10");
		// wrapper > 문자열
		String str = l2.toString();
		str = l2 + "";
		
		// 기본형 > wrapper
		l2 = Long.valueOf(10L);
		// wrapper > 기본형
		long l3 = l2.longValue();
		
		// 기본형 > 문자열
		str = String.valueOf(l3);
		// 문자열 > 기본형
		l3 = Long.parseLong(str);
		
		
		
		double d = Double.parseDouble(str);
		
		System.out.println(Integer.parseInt("FF", 16)); // 16진수
		System.out.println(Integer.toBinaryString(255)); // 2진수
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toHexString(255));
		
		int i = 0xFF;
		char ch = '가'; // 44032 //0xAC00;
		char ch2 = '\uAC00';
		System.out.println(ch);
		System.out.println(ch2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
