package student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// UI
		// Create Read Update Delete
		StudentService ss = new StudentService();
		
		while(true) {
			try {
				int input = StudentUtils.next("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료",Integer.class, n -> n >= 1 && n <= 5, "1-5사이값을입력");
				switch (input) {
				case 1:
					ss.list();
					break;
				case 2:
					ss.add();
					ss.cloneAndSort();
					break;
				case 3:
					ss.modify();
					ss.cloneAndSort();
					break;
				case 4:
					ss.remove();
					ss.cloneAndSort();
					break;
				case 5:
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
					oos.writeObject(ss.students);
					System.out.println("bye");
					return;
				default:
					break;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("정확한 숫자를 입력하세요");
			}
			catch (RuntimeException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
	}
}
