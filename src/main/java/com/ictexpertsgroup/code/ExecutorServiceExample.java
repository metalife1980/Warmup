package com.ictexpertsgroup.code;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            callables.add(new Callable<String>() {
                              @Override
                              public String call() throws Exception {
                                  return "Task " + finalI;
                              }
                          }
            );
        }

//        callables.add(new Callable<String>() {
//                          @Override
//                          public String call() throws Exception {
//                              return "Task 2";
//                          }
//                      }
//        );
//
//        callables.add(new Callable<String>() {
//                          @Override
//                          public String call() throws Exception {
//                              return "Task 3";
//                          }
//                      }
//        );

        List<Future<String>> futures = executorService.invokeAll(callables);

        for (Future<String> future : futures) {
            System.out.println("future.get = " + future.get());
        }

        executorService.shutdown();
    }


}
