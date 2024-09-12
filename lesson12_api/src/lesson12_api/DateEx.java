package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		//Date 1.0
		//Calendar 1.1
		
		// 특정날짜 및 시간 + 30일
		Date date = new Date(); // 현재
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		long target = date.getTime() + 10000L * 24 * 60 * 60 * 1000;
		System.out.println(new Date(target));
		
		System.out.println(date.getYear());
		System.out.println(date.getYear() + 1900);
		
		
		
	}
}
