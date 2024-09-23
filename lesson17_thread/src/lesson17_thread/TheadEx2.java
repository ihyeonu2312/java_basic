package lesson17_thread;

public class TheadEx2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> {
			for(int i = 1 ; i <= 10 ; i++) {
				System.out.println(i);
				try {
					Thread.sleep(550);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println("스레드 실행 종료");
		});
		t1.start();
		Thread.sleep(550);
		t1.interrupt();
		System.out.println("메인 종료");
	}
}
