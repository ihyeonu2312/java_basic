package lesson03;

public class ScopeEx {

	public static void main(String[] args) {
		char ch = 'A';
		{
			int num = 10;
			System.out.println(num);
			System.out.println(ch);
			{
				System.out.println(ch);
				
				
			}
		
		}
		
		System.out.println(ch);
		
	}

}
