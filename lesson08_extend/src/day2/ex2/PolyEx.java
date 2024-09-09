package day2.ex2;

public class PolyEx {
	
	public static void main(String[] args) {
		
		// 조상타입 객체 = new 자손생성자();
		
		Child c = new Child();
		
		c.walk();
		c.run();
		c.eat();
		System.out.println(c);
		
		//부모클래스의 자료형으로 선언 (자동형변환)
		Parent p = new Child();
		p.walk();
		p.run();// 재정의된 메서드가 실행
		((Child)p).eat();
		// p.eat(); //에러
		System.out.println(p);
		
		Parent p2 = new Parent();
//		p2 = p;
//		((Child)p2).eat();
		
//		Uncle u = new Child();
//		Uncle u = new Uncle();
//		((Child)u).walk();
//		u.walk();

//		instanceof
		
		if(p2 instanceof Parent) {
			System.out.println("p2는 Parent의 인스턴스");
		}
		if(p2 instanceof Child) {
			System.out.println("p2는 Child의 인스턴스");
			
			//인스턴스 메서드에서만 오버라이드
		}
	}

}
