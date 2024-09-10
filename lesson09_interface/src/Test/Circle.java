package Test;


public class Circle {
//	하나의 배열관리
//
//	원, 사각형
//	둘레계산 length
//	넓이계산 area
//
//	원기둥, 육면체
//	넓이계산 area
//	부피계산 volume
	
	double r;

	public Circle() {

	}

	public Circle(double r) {
		setR(r);
	}

	Circle setR(double r) {
		this.r = r;
		return this;
	}

	Circle printRound() {
		System.out.println(Math.PI * r * 2);
		return this;
	}

	Circle printArea() {
		System.out.println(Math.PI * r * r);
		return this;
	}
	
	
	
	
}
