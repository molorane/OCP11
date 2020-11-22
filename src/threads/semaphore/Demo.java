package threads.semaphore;

import java.util.concurrent.Semaphore;

public class Demo {

	private Semaphore semaphore = new Semaphore(4);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void m() throws InterruptedException {
		semaphore.acquire();
		
		semaphore.release();
	}

}
