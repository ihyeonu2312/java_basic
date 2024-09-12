package day2;

public class StringEx2 {
	
	public static void main(String[] args) {
		
		String str = "a";
		str += "b";
		
		String str2 = "1" + "2" + "3";
		
		// "a" "b" "ab" "1" "2" "12" "3" "123"
		
		str = "";
		StringBuffer sb = new StringBuffer("");
//		sb.append("fg");
//		System.out.println(sb);
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 2_950_000 ; i++) {
//			str += "0";
			sb.append("0");
		}
		long end = System.currentTimeMillis();
		str = sb.toString();
		sb = new StringBuffer(str);
		
		System.out.println(sb.length()+" ::: "+(end - start) + "ms");
//		System.out.println(str.length()+" ::: "+(end - start) + "ms");
		
		// cache, hash, buffer 성능 향상의 목적
		
		String s = "abcde"; // "abc123de"
		s = s.substring(0, 3)+"123"+s.substring(3);
		System.out.println(s);
		
		sb = new StringBuffer(s);
		sb.insert(3, "123");
		sb.deleteCharAt(sb.indexOf("c"));
		System.out.println(sb);
		
//		StringBuffer	: Thread safe
//		StringBuilder : Thread Unsafe
		
//		ArrayList
//		Vector
		System.out.println(Math.E);
	}
}
