package com.fishercoder.solutions.fourththousand;

public class _3894 {
    public static class Solution1 {
        public String trafficSignal(int timer) {
            if (timer == 0) {
                return "Green";
            } else if (timer == 30) {
                return "Orange";
            } else if (timer <= 90 && timer > 30) {
                return "Red";
            } else {
                return "Invalid";
            }
        }
    }
}
