package lesson07_oop;

public class MarineMain {
	public static void main(String[] args) {
		
		Marine marine = new Marine();
		
		System.out.println(marine.hp);
		
		marine.hp -= 5 * 6;
				
		System.out.println(marine.hp);
		
		Marine.att++; // 공업
		
		System.out.println(marine.att);
		
			
		Marine.att++; // 공업
		System.out.println(marine.att);
	}
	int d (){
		return 0;
	}

}
