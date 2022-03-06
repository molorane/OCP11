package threads.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		CountDownLatch countDownLatch = new CountDownLatch(6);
		executorService.submit(new Service(countDownLatch));
		executorService.submit(new Service(countDownLatch));
		executorService.submit(new Service(countDownLatch));
		executorService.submit(new Service(countDownLatch));
		executorService.submit(new Service(countDownLatch));
		
		countDownLatch.await();
		
		System.out.println("All dependent services initialized.");
		executorService.shutdown();		

	}
	
	public static class Service implements Runnable{
		
		private CountDownLatch latch;
		
		public Service(CountDownLatch latch) {
			this.latch = latch;
		}
		
		@Override
		public void run() {
			latch.countDown();
		}
		
	}

}
