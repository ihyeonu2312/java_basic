package lesson12_api;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx {

	// format : 원시 > 문자열
	// parse : 문자열 > 원시
	
	public static void main(String[] args) throws ParseException {
		
		double[] scores = {90.555, 88880.6666, 7000.7777, 600.66666666, 5500000.5};
		
		DecimalFormat df = new DecimalFormat("#, ###.000");
		
		for(double d : scores) {
			System.out.println(df.format(d));
		}			
		Number number = df.parse("9,999.999");
		double dou = number.doubleValue();
		System.out.println(dou);
		
		
	}
}