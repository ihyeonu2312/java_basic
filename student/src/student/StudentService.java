package student;

import static student.StudentUtils.*;
import java.util.Arrays;


// Logic

public class StudentService extends Student {

	

		
	
	
	private Student[] students = new Student[5];
	private int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
	}
	
	// 학생 등록
	public void add() {
//		try {
			
	
		int no = nextInt("학번");
		
//		if(no != ) {
//			throw new ScoreException ("가");
//		}
		
		String name = nextLine("이름");
		int kor = nextInt("국어 점수");
		int eng = nextInt("영어 점수");
		int mat = nextInt("수학 점수");
		
	
		//		System.out.println("add()");
	
	
		if(students.length == cnt) {
			students = Arrays.copyOf(students, students.length * 2 );
		}
		students[cnt++] = new Student(no, name, kor, eng, mat);
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

	
	// 학생 목록
	public void list() {
//		System.out.println("list()");
		System.out.println("학번	이름	국어	영어	수학	총점	평균");
		System.out.println("====================================================");
		
		for(int i = 0 ; i < cnt ; i++) {
//			System.out.printf("%3d %5s %6d %6d %7d %7d %7.2f\n",
//					students[i].no,
//					students[i].name,
//					students[i].kor,
//					students[i].eng,
//					students[i].mat,
//					students[i].total(),
//					students[i].avg()
//					);
			System.out.println(students[i]);
		}
	}
	// 이름은 반드시 한글, 공백 불가능, 최소 2글자, 최대 4글자
	// 점수의 범위는 0~100까지
	// 학번 중복 불허
	
	
	// 학생 이름, 점수 수정
	public void modify() {
		try {
			
		Student s = findByNo();
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		s.setName(nextLine("이름"));
		s.setKor(nextInt("국어"));
		s.setEng(nextInt("영어"));
		s.setMat(nextInt("수학"));
		} catch(NumberFormatException e) {
			System.out.println("숫자를 입력해 주세요");
		}
		
//		System.out.println("수정");
//		int modifyno = StudentUtils.nextInt("수정할 학번");
//		for(int i = 0 ; i < students.length ; i++ ) {
//			if(modifyno != students[i].no){
//				break;
//			}
//		}
	}
	
	// 학생 삭제
	public void remove() {
		try {
		
		
		Student s = findByNo();
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i] == s) {
				// 삭제
				System.arraycopy(students, i + 1, students, cnt-- -i, 1);
				break;
			}
		}
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력해 주세요");
		}
	}
	private Student findByNo() {
		Student student = null;
		int no = nextInt("학번");
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i].getNO() == no) {
				student = students[i];
			}
		}
		return student;
		
		
		
		
	}
	
}