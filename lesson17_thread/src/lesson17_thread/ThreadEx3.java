package lesson17_thread;

public class ThreadEx3 {

	public static void main(String[] args) throws InterruptedException {
		
		Sum t1 = new Sum();
		Sum t2 = new Sum();
		
		t1.start();
		t2.start();
		
		// join() 다른 스레드의 실행완료까지 기다리는 메서드
		t1.join();
		t2.join();
		System.out.println(t1.sum + t2.sum);
	}
}

class Sum extends Thread {
	int sum;
	public void run() {
		for(int i = 0 ; i <= 1000 ; i++) {
			sum += i;
		}
	}
}