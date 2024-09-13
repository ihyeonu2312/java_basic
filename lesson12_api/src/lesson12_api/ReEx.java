package lesson12_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("a[a-z]*");
		Matcher m;
		
		m = pattern.matcher("bat");
		System.out.println("bat = "+m.matches());
		
		m = pattern.matcher("cat");
		System.out.println("cat = "+m.matches());
		
		m = pattern.matcher("zed");
		System.out.println("zed = "+m.matches());
		
		m = pattern.matcher("bd");
		System.out.println("bd = "+m.matches());
		
		m = pattern.matcher("ba");
		System.out.println("ba = "+m.matches());
		
		"bat".matches("b[a-z]*"); // boolean
		System.out.println("bat".matches("b[a-z]*"));
		
	}
	
	
}
