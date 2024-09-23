package student;
import static student.StudentUtils.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

// Logic
public class StudentService {
	public List<Student> students = new ArrayList<Student>();
	private List<Student> totalSortedStudents;
	private List<Student> noSortedStudents;
	private List<Student> nameSortedStudents;
	
//	private int cnt;
	
	{
		students.add (new Student(1, "새똥이", 80, 90, 100));
		students.add (new Student(2, "개똥이", 77, 66, 77)); // 등록 시 유지
		students.add (new Student(3, "새똥이", 80, 90, 100));
		students.add (new Student(4, "개똥이", 77, 66, 77));
		
		try {
			loadlist();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cloneAndSort();
	}
	// 학생 등록
	public void add() throws FileNotFoundException, IOException {
		int no = next("학번", Integer.class, n -> findBy(n) == null, "중복된 학번입니다");
		String name = next("이름", String.class, str -> str.matches("^[가-힣]{2,4}") , "2-4글자 올바른 이름을 입력하세요");
		int kor = next("국어", Integer.class, i -> i <= 100 && i >= 0, "0 - 100사이 점수를 입력하세요");
		int eng = next("영어", Integer.class, i -> i <= 100 && i >= 0, "0 - 100사이 점수를 입력하세요");
		int mat = next("수학", Integer.class, i -> i <= 100 && i >= 0, "0 - 100사이 점수를 입력하세요");
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentAdd"));
		
	    	students.add(new Student(no, name, kor, eng, mat));
	    	
//	    	byte a = students.add(new Student(no, name, kor, eng, mat));
	    
	}
	// 학생 목록 조회
	public void list() {
//		System.out.println("list()");
		int input = next("1. 입력순 2. 학번순 3. 이름순 4. 석차순", Integer.class, i -> i <= 4 && i >= 1 , "1- 4사이값을 입력하세요");
		List<Student> tmp = null;
		switch (input) {
		case 1:
			tmp = students;
			break;
		case 2:
			tmp = noSortedStudents;
			break;
		case 3:
			tmp = nameSortedStudents;
			break;
		case 4:
			tmp = totalSortedStudents;
			break;
		default:
			System.out.println("????");
			break;
		}
		System.out.println("학번   이름    국어    영어    수학    총점    평균");
		System.out.println("===================================================");
		for(int i = 0 ; i < tmp.size() ; i++) {
	
			System.out.println(tmp.get(i));
		}
	}
	// 학생 이름, 점수 수정
	public void modify() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		Student s = findBy(next("학번", Integer.class, n -> findBy(n) != null, "존재하지않는 학번"));
		// 3. 이름, 국어, 영어, 수학 점수 변경

//		Predicate<String> r;
//		r = new Predicate<String>() {
//			
//			@Override
//			public boolean test(String t) {
//				for(;(char)t < '가';) {
//					
//				}
//				return t < '가' || t > '힣';
//			}
//		};
		
		Predicate<Integer> p;
		p = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t >= 0 && t <= 100;
			}
		};
		String name = next("이름", String.class, str -> str.matches("^[가-힣]{2,4}"), "정확한 이름을 입력하세요");
		s.setName(name);
		Integer kor = next("국어", Integer.class, p, "0이상 100이하의 점수를 입력하세요");
		s.setKor(kor);
		Integer eng = next("영어", Integer.class, p, "0이상 100이하의 점수를 입력하세요");
		s.setEng(eng);
		Integer mat = next("수학", Integer.class, p, "0이상 100이하의 점수를 입력하세요");
		s.setMat(mat);
		
	}
	// 학생 삭제
	public void remove() {
		Student s = findBy(next("학번", Integer.class, n -> findBy(n) != null, "존재하지않는 학번"));
		// 3. 이름, 국어, 영어, 수학 점수 변경
		students.remove(s);
	}
	
	private Student findBy(int no) {
		Student student = null;
//		int no = nextInt("학번");
		for(int i = 0 ; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
			}
		}
		return student;
	}
	/**
	 * 학생이름 유효성 검증, 이름은 반드시 한글, 최소 2 최대 4글자의 한글
	 * @param name 학생의 이름
	 */
	String checkName(String name) {
		char[] chs = name.toCharArray();
		//	String s = new String(chs);
		if(chs.length < 2 || chs.length > 4) {
			throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요");
		}
		// '가', '나', '다', '라'
		for(char c : chs) {
			if(c < '가' || c > '힣') {
				throw new RuntimeException("한글로 구성된 이름으로 작성하세요");
			}
		}
		return name;
	}
	/**
	 * 범위에 대한 탐색 start 이상, end 이하의 조건을 만족하지 않을 경우 예외 발생
	 * @param num 검증 대상 숫자
	 * @param start 시작 값
	 * @param end 종료 값
	 * @return 원래의 값
	 */
	int checkRange(int num, int start, int end) throws RangeException{
		if(num < start || num > end) {
			throw new RangeException(start, end);
		}
		return num;
	}
	int checkRange(int num) throws RangeException {
		return checkRange(num, 0, 100);
	}
	
	
	List<Student> copy = new ArrayList<>();
	// 정렬
	public void cloneAndSort() {
		noSortedStudents = new ArrayList<Student>(students);
		nameSortedStudents= new ArrayList<Student>(students);
		totalSortedStudents= new ArrayList<Student>(students);
		
		noSortedStudents.sort((a, b) -> a.getNo() - b.getNo());
		nameSortedStudents.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		Comparator<Student> comp = new MyComp();
		totalSortedStudents.sort(comp);
	}
	
	public void loadlist() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
		List<Student> result = (List<Student>) ois.readObject();
		students = result;

	}
}
class MyComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return  o2.total() - o1.total();
	}
}
