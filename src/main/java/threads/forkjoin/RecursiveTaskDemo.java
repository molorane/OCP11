package threads.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        ForkJoinPool fjp = new ForkJoinPool();
        DoubleNumbersRecursiveAction dn = new DoubleNumbersRecursiveAction(list);
        Integer sum = fjp.invoke(dn);
        System.out.println(sum);
    }


    @SuppressWarnings("serial")
    static class DoubleNumbersRecursiveAction extends RecursiveTask<Integer> {

        private final List<Integer> list;

        public DoubleNumbersRecursiveAction(List<Integer> list) {
            this.list = list;
        }

        @Override
        protected Integer compute() {
            if (list.size() <= 2) {
                return list.stream().mapToInt(x -> x).sum();
            } else {
                int mid = list.size() / 2;
                List<Integer> list1 = list.subList(0, mid);
                List<Integer> list2 = list.subList(mid, list.size());

                DoubleNumbersRecursiveAction t1 = new DoubleNumbersRecursiveAction(list1);
                DoubleNumbersRecursiveAction t2 = new DoubleNumbersRecursiveAction(list2);

                t1.fork();
                t2.fork();
                return t1.join() + t2.join();
            }
        }


    }

}
