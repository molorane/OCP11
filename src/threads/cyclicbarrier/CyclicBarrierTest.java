package threads.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Creates a CyclicBarrier object by passing the number of threads and the thread to run
// when all the threads reach the barrier
public class CyclicBarrierTest {
	public static void main(String[] args) {
		// a mixed-double tennis game requires four players;
		// so wait for four players
		// (i.e., four threads) to join to start the game
		
		
		System.out.println("Reserving tennis court \n" + "As soon as four players arrive, game will start");
		CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
		Player p = new Player(barrier, "Joe");
		Player p1 = new Player(barrier, "Dora");
		Player p2 = new Player(barrier, "Tintin");
		Player p3 = new Player(barrier, "Barbie");
		
		/* ExecutorService service = Executors.newFixedThreadPool(4);
		service.submit(p);
		service.submit(p1);
		service.submit(p2);
		service.submit(p3);
		service.shutdown();
		*/
	}
}