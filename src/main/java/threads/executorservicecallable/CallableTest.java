package threads.executorservicecallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;

//Factorial implements Callable so that it can be passed to an ExecutorService
//and get executed as a task.
class Factorial implements Callable<Long> {
	
	private long n;

	public Factorial(long n) {
		this.n = n;
	}

	public Long call() throws Exception {
		if (n <= 0) {
			throw new Exception("for finding factorial, N should be > 0");
		}
		long fact = 1;
		for (long longVal = 1; longVal <= n; longVal++) {
			Thread.sleep(1000);
			fact *= longVal;
		}
		return fact;
	}
}

// Illustrates how Callable, Executors, ExecutorService, and Future are related;
// also shows how they work together to execute a task
public class CallableTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// the value for which we want to find the factorial
		int N = 10;
		// get a callable task to be submitted to the executor service
		Callable<Long> task = new Factorial(N);
		// create an ExecutorService with a fixed thread pool having one thread
		ExecutorService es = Executors.newSingleThreadExecutor();
		ExecutorService tp = Executors.newWorkStealingPool(3);
		// submit the task to the executor service and store the Future object
		Future<Long> future = tp.submit(task);
		System.out.println("Do something..");
		// wait for the get() method that blocks until the computation is complete.
		long result = future.get();
		System.out.println("Completed...");
		System.out.printf("factorial of %d is %d", N, result);
		// done. shutdown the executor service since we don't need it anymore
		es.shutdown();
		tp.shutdown();
	}
	
}