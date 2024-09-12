package student;

import static student.StudentUtils.*;
import java.util.Arrays;


// Logic

public class StudentService extends Student {

	

		
	
	
	private Student[] students = new Student[5];
	private Student[] totalSortedStudents;
	private Student[] noSortedStudents;
	private Student[] nameSortedStudents;
	
	private int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
		
		totalSortedStudents = students.clone();
	}
	
	// 학생 등록
	public void add() {
//		try {
			
	
		int no = nextInt("학번");
		if(findBy(no) != null) {
			throw new RuntimeException("중복되지 않는 학번을 입력하세요");
		}
//		if(no != ) {
//			throw new ScoreException ("가");
//		}
		
		String name = nextLine("이름");
		checkName(nextLine("이름"));
		int kor = checkRange(nextInt("국어 점수"));
		if(kor > 0 || kor < 100) {
			throw new RangeException(0, 100);
		}
		int eng = checkRange(nextInt("영어 점수"));
		int mat = checkRange(nextInt("수학 점수"));
		
	
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
		int input = checkRange(nextInt("1.입력순 2.학번순 3.이름순 4.석차순"),1,4);
		Student[] tmp = null;
		switch (input) {
		case 1:
			tmp= students;
			break;
		case 2:
			tmp= noSortedStudents;
			break;
		case 3:
			tmp= nameSortedStudents;
			break;
		case 4:
			tmp= totalSortedStudents;
			break;

		default:
			break;
		}
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
			System.out.println(tmp[i]);
		}
	}
	// 이름은 반드시 한글, 공백 불가능, 최소 2글자, 최대 4글자
	// 점수의 범위는 0~100까지
	// 학번 중복 불허
	
	
	// 학생 이름, 점수 수정
	public void modify() {
//		try {
			
		Student s = findBy(nextInt("학번"));
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		s.setName(nextLine("이름"));
		s.setKor(nextInt("국어"));
		s.setEng(nextInt("영어"));
		s.setMat(nextInt("수학"));
////		} catch(NumberFormatException e) {
////			System.out.println("숫자를 입력해 주세요");
//		}
		
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
//		try {
		
		
		Student s = findBy(nextInt("학번"));
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
//		}catch(NumberFormatException e) {
//			System.out.println("숫자를 입력해 주세요");
//		}
	}
	private Student findBy(int no) {
		Student student = null;
//		int no = nextInt("학번");
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i].getNO() == no) {
				student = students[i];
			}
		}
		return student;
		
		
		
		
	}
	
	/*
	 *  학생이름 유효성 검증, 이름은 반드시 한글, 최소 2 ,최대 4
	 * @param name 학생의 이름
	 */
	
	
	
	void checkName(String name) {
		char[] chs = name.toCharArray();
//		String s = new String(chs);
		if(chs.length < 2 || chs.length > 4) {
			throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요");
		}
		// '가', '나', '다', '라'
		for(char c : chs) {
			if(c < '가' || c > '힣') {
				throw new RuntimeException("한글로 구성된 이름을 입력하세요");
			}
		}
	}
	/*
	 * 범위에 대한 탐색 start 이상,  end이하의 조건을 만족하지 않을 경우 예외발생
	 * @param num검증 숫자
	 * @param
	 * @param
	 * 
	 * 
	 */
	
	int checkRange(int num, int start, int end) throws RangeException{
		if(num < start || num > end) {
			throw new RangeException(start, end);
		
	}
		return num;
	}
	int checkRange(int num) {
		return checkRange(num, 0, 100);
	}
	void cloneAndSort() {
		noSortedStudents = students.clone();
		nameSortedStudents = students.clone();
		totalSortedStudents = students.clone();
		
		sort(0, noSortedStudents);
		sort(1, nameSortedStudents);
		sort(2, totalSortedStudents);
	}
	// 정렬
	void sort(int type, Student[] target) {
		Student[] arr = students;
		System.out.println("초기"+ Arrays.toString(arr));
		//회차반복
		for(int i = 0 ; i < cnt - 1; i++) {
			//비교반복
			for(int j = 0 ; j < arr.length - 1 - i ;j++) {
				//값비교자리교환
				boolean condition =false;
				switch (type) {
				case 0:
//					condition = arr[j].getNO()
					break;
				case 1:
//					condition = arr[j].getName() < (arr[j+1].getName()) > 0 ;
					break;
				case 2:
					condition = arr[j] .total() < arr[j+1].total();
					break;

				default:
					break;
				}
				if(arr[j] .total() < arr[j+1].total()) {
					Student tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=tmp;
					
				}
			}
		}
	}
	
}
	
