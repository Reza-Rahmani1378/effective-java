package com.amazon.effective_java.studies.multi_threading;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoiningThread {

    /**
     * Calculating Factorial with Joining Thread.
     */
    public static void main(String[] args) throws InterruptedException {
        List<Long> inputNumbers = Arrays.asList(100000000L , 23L, 34L, 23442L , 234L);
        List<FactorialThread> threads = new ArrayList<>();
        for (Long inputNumber : inputNumbers) {
            threads.add(new FactorialThread(inputNumber));
        }

        for (Thread thread : threads) {
            thread.setDaemon(true);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join(2000);
        }



        for (int i = 0; i < inputNumbers.size(); i++) {
            FactorialThread factorialThread = threads.get(i);
            if (factorialThread.isFinish()) {
                System.out.println("Factorial of " + inputNumbers.get(i) + " is " +  factorialThread.getResult());
            } else {
                System.out.println("The calculation for " + inputNumbers.get(i) + " is still in progress");
            }
        }
    }


    private static class FactorialThread extends Thread {
        private final long inputNumber;
        private BigInteger result = BigInteger.ZERO;
        private boolean isFinish;
        public FactorialThread(long inputNumber) {
            this.inputNumber = inputNumber;
        }

        @Override
        public void run() {
            this.result = factorial(inputNumber);
            this.isFinish = true;
        }

        public BigInteger factorial(long inputNumber) {
            BigInteger tempResult = BigInteger.ONE;
            for (long i = inputNumber; i > 0 ; i --) {
                tempResult = tempResult.multiply(new BigInteger(Long.toString(i)));
            }

            return tempResult;
        }


        public BigInteger getResult() {
            return result;
        }

        public boolean isFinish() {
            return isFinish;
        }
    }
}
