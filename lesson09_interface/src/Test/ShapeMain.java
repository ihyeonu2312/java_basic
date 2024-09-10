package Test;

public class ShapeMain {
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[2];
		
		shapes[0] = new Circle();
		shapes[1] = new Quadrangle();
		
		System.out.println(shapes[0].length());
	}

}
