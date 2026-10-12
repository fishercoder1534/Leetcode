package com.fishercoder.solutions.fifththousand;

public class _4080 {
    public static class Solution1 {
        class BusBooking {
            boolean[] booked;
            int[] timeTaken;
            int totalTime = 0;
            int bookedSeats = 0;
            int rowCount;

            public BusBooking(int n) {
                this.rowCount = n;
                this.booked = new boolean[n * 4];
                this.timeTaken = new int[n * 4];
            }

            public void toggle(String seat) {
                int r = Integer.parseInt(seat.substring(1)) - 1;
                int c = seat.charAt(0) - 'A';
                int t = r * 4 + c;

                if (booked[t]) {
                    totalTime -= timeTaken[t];
                    booked[t] = false;
                    timeTaken[t] = 0;
                    bookedSeats--;
                } else {
                    booked[t] = true;
                    bookedSeats++;

                    if (c == 1 || c == 2) {
                        timeTaken[t] = 1;
                    } else if (c == 0) {
                        int adjIndex = r * 4 + 1;
                        timeTaken[t] = booked[adjIndex] ? 3 : 1;
                    } else {
                        int adjIndex = r * 4 + 2;
                        timeTaken[t] = booked[adjIndex] ? 3 : 1;
                    }
                    totalTime += timeTaken[t];
                }
            }

            public int getTotalTime() {
                return totalTime;
            }

            public int getMinTime() {
                return bookedSeats;
            }
        }
    }
}
