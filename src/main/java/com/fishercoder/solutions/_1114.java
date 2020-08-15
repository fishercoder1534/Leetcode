package com.fishercoder.solutions;

public class _1114 {
    public static class Solution1 {
        static class Foo {

            private static volatile boolean onePrinted;
            private static volatile boolean twoPrinted;

            public Foo() {
                onePrinted = false;
                twoPrinted = false;
            }

            public synchronized void first(Runnable printFirst) throws InterruptedException {

                // printFirst.run() outputs "first". Do not change or remove this line.
                printFirst.run();
                onePrinted = true;
                notifyAll();
            }

            public synchronized void second(Runnable printSecond) throws InterruptedException {
                while (!onePrinted) {
                    wait();
                }

                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();
                twoPrinted = true;
                notifyAll();
            }

            public synchronized void third(Runnable printThird) throws InterruptedException {
                while (!twoPrinted) {
                    wait();
                }

                // printThird.run() outputs "third". Do not change or remove this line.
                printThird.run();
            }
        }
    }
}
