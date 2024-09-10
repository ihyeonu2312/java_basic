package Test;


public class Circle extends Shape{

	
	double r;
	
	
	@Override
	double length() {
		return Math.PI * r * 2;
	}
	
	
	@Override
	double area() {
		return Math.PI * r * r;
	}
	
	
	
//	
//	public void area() {
//		area = Math.PI * r * r;
//		
//	}
//	
	
	
	
}

