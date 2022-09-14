package com.amazon.effective_java.studies.multi_threading;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoiningThread {

    /**
     * Calculating Factorial with Joining Thread.
     * @param args
     */
    public static void main(String[] args) {
        List<Long> inputNumbers = Arrays.asList(0L , 23L, 34L, 23442L , 234L);
        List<FactorialThread> threads = new ArrayList<>();
        for (Long inputNumber : inputNumbers) {
            threads.add(new FactorialThread(inputNumber));
        }

        for (FactorialThread thread : threads) {
            thread.start();
        }


    }


    private static class FactorialThread extends Thread {
        private long inputNumber;
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
