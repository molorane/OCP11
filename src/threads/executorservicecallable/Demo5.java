package threads.executorservicecallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		Callable<String> c = () -> "Nomfundo";
		
		Future<? extends String> future = service.submit(c);
		
		String o = future.get();
		System.out.println(o);
		
		service.shutdown();
	}

}
