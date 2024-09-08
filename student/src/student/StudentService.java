package student;

import java.util.Arrays;

// Logic

public class StudentService {

	Student[] students = new Student[5];
	int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
	}
	
	// 학생 등록
	void add() {
		
		
		int no = StudentUtils.nextInt("학번");
		String name = StudentUtils.nextLine("이름");
		int kor = StudentUtils.nextInt("국어점수");
		int eng = StudentUtils.nextInt("영어점수");
		int mat = StudentUtils.nextInt("수학점수");
		
		students[cnt++] = new Student(no, name, kor, eng, mat);
	
		//		System.out.println("add()");
		
	
		if(students.length == cnt) {
			System.out.println("문제 발생 직전");
			students = Arrays.copyOf(students, students.length * 2 );
		
		}
	}

	
	// 학생 목록
	void list() {
//		System.out.println("list()");
		System.out.println("학번	이름	국어	영어	수학	총점	평균");
		System.out.println("====================================================");
		
		for(int i = 0 ; i < cnt ; i++) {
			System.out.printf("%3d %5s %6d %6d %7d %7d %7.2f\n",
					students[i].no,
					students[i].name,
					students[i].kor,
					students[i].eng,
					students[i].mat,
					students[i].total(),
					students[i].avg()
					);
		}
	}
	
	// 학생 이름, 점수 수정
	void modify() {
		System.out.println("수정");
		
	}
	
	// 학생 삭제
	void remove() {
		System.out.println("삭제할 학번을 입력하세요");
		int del = StudentUtils.nextInt("삭제할 학번");
		if (del == students[del+1].no) {
		cnt--;
		}
		
		
	}
}
