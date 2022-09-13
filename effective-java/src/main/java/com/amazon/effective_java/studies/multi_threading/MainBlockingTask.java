package com.amazon.effective_java.studies.multi_threading;

public class MainBlockingTask {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());
        thread.start();

        Thread thread1 = new Thread(new BlockingTask());
        thread1.start();

        thread.interrupt();
        thread1.interrupt();
    }

    private static class BlockingTask implements Runnable {

        @Override
        public void run() {
            try
            {
                System.out.println("Hi");
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                System.out.println("Exiting Blocking...");
            }
        }
    }
}
