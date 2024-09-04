package lesson04;

public class Exercise7 {
	public static void main(String[] args) {
		
		boolean exit = false;
		int cnt = 0;
		while(!exit) {
			int val = (int)(Math.random() * 6 + 1);
			System.out.println("("+val+")");
			cnt++;
			if(val == 6) {
				exit = true;
			}
		}
		System.out.println(cnt + "회");
	}
}
