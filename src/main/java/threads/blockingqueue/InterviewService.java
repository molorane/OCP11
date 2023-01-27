package threads.blockingqueue;

import java.util.concurrent.*;

public class InterviewService {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1, true);
        InterviewScheduler producer = new InterviewScheduler(bq);
        InterviewProcessor consumer = new InterviewProcessor(bq);
        InterviewProcessor consumer2 = new InterviewProcessor(bq);
        InterviewProcessor consumer3 = new InterviewProcessor(bq);

        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(producer);
        es.execute(consumer);
        es.execute(consumer2);
        es.execute(consumer3);
    }

}
