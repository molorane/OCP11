package threads.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class InterviewService {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(5);
        InterviewScheduler producer = new InterviewScheduler(bq);
        InterviewProcessor consumer = new InterviewProcessor(bq);
        InterviewProcessor consumer2 = new InterviewProcessor(bq);

        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer2).start();
    }

}
