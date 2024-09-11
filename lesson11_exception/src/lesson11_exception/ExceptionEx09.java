package lesson11_exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx09 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};	// 0x100
		int[] arr2 = arr;	// 0x100
		int[] arr3 = arr.clone();	// 0x200 값만 복사

		
		
		try(FileOutputStream fos = new FileOutputStream("1.txt")) {
			byte[] bs = {'A', 'B', 'C', 'D', 'E', 234-256, 176-256, 128-256};
			fos.write(bs);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
	
}