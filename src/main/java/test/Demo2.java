package test;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Collectors;

import static java.util.function.Predicate.*;

class C {

    public <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z) {
        return new HashMap<T, Z>();
    }

    public BlockingQueue<Runnable> pp() {
        return null;
    }
}

public class Demo2 extends C {

    @Override
    public <T extends Number, X extends Number> Map<T, X> getMap(T t, X z) {
        return new HashMap<T, X>();
    }

    public void En(Object o) {
        System.out.println(o.getClass());
    }

    public String p(String o) {
        return o.getClass().getName();
    }

    public void p1(String o) {
        System.out.println(o);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public <T> List<? extends T> p2(String o) {
        return new ArrayList();
    }

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(2000));
        LinkedBlockingDeque<Runnable> ll = new LinkedBlockingDeque<Runnable>();
        //pp(ll);
    }


    @Override
    public LinkedBlockingDeque<Runnable> pp() {
        return null;
    }

}
