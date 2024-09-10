package lesson09_interface;

public class ComplexerMain {
	
	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Printer.INK);
		
		System.out.println(Fax.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		Fax fax = new Fax() {
			
			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub
				System.out.println("fax 송신");
			}
			
			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub
				System.out.println("fax 수신");
			}
		};
		
		fax.send("abcd");
		
		Complexer com2 = new Complexer() {
			
			public void scan() {
				System.out.println("com2의 스캔");
			}
			
		};
		com2.print();
		com2.scan();
		
		//comparator : 비교자
		//comparable : 
		
		
	}
}
