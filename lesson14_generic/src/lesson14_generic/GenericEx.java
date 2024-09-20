package lesson14_generic;

public class GenericEx {

	public static void main(String[] args) {
		Box<Integer, String, Object> box = new Box<>();
		box.setItem(10);
		
		int result = (Integer)box.getItem();
		System.out.println(result);
		
	}
}

class Box<T, R, V>{
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
		
	}
}