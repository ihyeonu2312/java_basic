package shape;

public class Cylinder extends Shape implements D3{
	
	private Circle circle;
	
	private int z;

	public Cylinder(int r, int z) {
		super("원기둥");
		circle = new Circle(r);
		this.z = z;
	}
	public Cylinder(Circle circle, int z) {
		super("원기둥");
		this.circle = circle;
		this.z = z;
	}
	
	@Override
	public double volume() {
		return circle.area() * z;
	}
	@Override
	public double area() {
		return circle.area() * 2 + circle.length() * z;
	}
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
	
//	double r;
//	
//	double h;
//	
//	
//	
//	@Override
//	double length() {
//		
//		return 0;
//	}
//	
//	
//	
//	
//	@Override
//	double area() {
//		return Math.PI * r * r;
//	}
//	
//	
//	
////	double length = 2 * Math.PI * r;
//	
//	
	

