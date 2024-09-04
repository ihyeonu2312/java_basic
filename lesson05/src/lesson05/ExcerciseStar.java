package lesson05;

public class ExcerciseStar {
	
	public static void main(String[] args) {
	
		for(int i = -2 ; i < 3 ; i++) {
			
			for(int j = -2 ; j < 3 ; j++) {
				if(i * j >= -1 && i * j <= 1) {
//				System.out.printf("(%2d,%2d)", i, j);
				System.out.printf("*");
				}
				else
//					System.out.printf("%7c", ' ');
				System.out.print(" ");
		}
				
			System.out.println();
				
			}
	}
}