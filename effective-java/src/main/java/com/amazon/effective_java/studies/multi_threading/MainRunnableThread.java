package com.amazon.effective_java.studies.multi_threading;


public class MainRunnableThread {
    /**
     * @author Reza Rahmani
     * @param args
     * @throws InterruptedException
     * Create Thread with Runnable interface
     */
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(() -> {
            System.out.println("We are in thread " + Thread.currentThread().getName());
            System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
            throw new RuntimeException("Internal Exception...");

        });
        System.out.println("We are in thread :" + Thread.currentThread().getName() + " before starting new thread");
        myThread.setName("new worker thread.");
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();
        System.out.println("We are in thread :" + Thread.currentThread().getName() + " after starting new thread");
        myThread.setUncaughtExceptionHandler((thread, throwable) -> {

            System.out.println("A critical exception happened in thread " + thread.getName() + " the error is " + throwable.getMessage());

        });

    }
}
