package shape;


public class Circle extends Shape implements D2{

	private final int r;

	public Circle(int r) {
		super("원");
		this.r = r;
	}

	@Override
	public double length() {
		return 2 * r * Math.PI;
	}

	@Override
	public double area() {
		return r * r * Math.PI;
	}
	
	
	
	
//	하나의 배열관리
//
//	원, 사각형
//	둘레계산 length
//	넓이계산 area
//
//	 원기둥, 육면체
//	넓이계산 area
//	부피계산 volume
//	
//	double r;
//	
//	
//	@Override
//	double length() {
//		return Math.PI * r * 2;
//	}
//	
//	
//	@Override
//	double area() {
//		return Math.PI * r * r;
//	}
}

