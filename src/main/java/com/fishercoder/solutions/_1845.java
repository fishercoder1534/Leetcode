package com.fishercoder.solutions;

public class _1845 {
    public static class Solution1 {
        class SeatManager {
            boolean[] seats;
            int next;

            public SeatManager(int n) {
                seats = new boolean[n + 1];
                next = 1;
            }

            public int reserve() {
                seats[next] = true;
                int tmp = next;
                while (next < seats.length && seats[next]) {
                    next++;
                }
                return tmp;
            }

            public void unreserve(int seatNumber) {
                seats[seatNumber] = false;
                if (next > seatNumber) {
                    next = seatNumber;
                }
            }
        }
    }
}
