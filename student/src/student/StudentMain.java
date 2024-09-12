package student;

public class StudentMain {
	
	public static void main(String[] args) throws Exception{
		// 이름은 반드시 한글, 공백 불가능, 최소 2글자, 최대 4글자
		// 점수의 범위는 0~100까지
		// 학번 중복 불허
		
		
		// UI
		// Create Read Update Delete
		StudentService ss = new StudentService();
		while(true) {
			try {
				
	//			System.out.println("1.조회	2.등록	3.수정	4.삭제	5.종료");
	//			int input = Integer.parseInt(scanner.nextLine());
				int input = ss.checkRange(StudentUtils.nextInt("1.조회	2.등록	3.수정	4.삭제	5.종료"),1,5);
				switch(input) {
					case 1:
//						ss.sort();
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
						System.out.println("bye");
						return;
					default:
						break;
						
					}
				} 
			catch(NumberFormatException e) 
			{
					System.out.println("숫자를 입력해 주세요");
			}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
}
