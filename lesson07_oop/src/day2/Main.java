package day2;

public class Main {
	int i;
	static int si;
	
	void run() {
		System.out.println(i); // this.i
		System.out.println(si); // Main.si
		System.out.println(this);
		
	}
	static void sRun() {
//		System.out.println(i);
//		System.out.println(this); // 인스턴스가 만들어진 주소 this
	}
	
	public static void main(String[] args) throws ClassNotFoundException{
//		System.out.println(InitMain.arr2.length);
		Main.sRun();
//		Class cls = InitMain.class;
//		Class cls = Class.forName("day2.InitMain");
	}
	
}
