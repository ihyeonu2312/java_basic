package lesson12_api;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random random = new Random(System.currentTimeMillis());
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print(random.nextInt(6)+1 +" ");
//			System.out.print(random.nextInt());
		}
	}
}
