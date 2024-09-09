package student;

public class Student {
	// 학생 예제 > java beans 명세서에 맞게끔 수정
	// field는 private, method는 public
	private int no;
	private	String name;
	private int kor;
	private	int eng;
	private	int mat;
	
	public Student() {}
	
	public Student(int no, String name, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// no getter
	public int getNO() {
		return no;
		
	}
	
	// no stter
	public void setNo(int no){
		this.no = no;
		
	}
	
	public String toString() {
		return String.format("%3d %5s %6d %6d %7d %7d %7.2f", no, name, kor, eng, mat, total(), avg());
		
	}
	
	public int total() {
		return kor + eng + mat;
	
	}
	public double avg() {
		return total() / 3d;
	}
}