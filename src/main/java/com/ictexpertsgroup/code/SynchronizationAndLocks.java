package com.ictexpertsgroup.code;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizationAndLocks {
    public int count = 0;

    public void increment() {
        count = count + 1;
    }

    public static void main(String args[]) {
        SynchronizationAndLocks inc = new SynchronizationAndLocks();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        IntStream.range(0, 10000).forEach(i -> executorService.submit(inc::increment));

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
        }
        System.out.println(inc.count);
    }
}
