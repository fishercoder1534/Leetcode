package com.fishercoder.solutions;

public class _1603 {
    public static class Solution1 {
        class ParkingSystem {
            int[] slots = new int[3];

            public ParkingSystem(int big, int medium, int small) {
                slots[0] = big;
                slots[1] = medium;
                slots[2] = small;
            }

            public boolean addCar(int carType) {
                if (carType == 1) {
                    if (slots[0] > 0) {
                        slots[0]--;
                        return true;
                    } else {
                        return false;
                    }
                } else if (carType == 2) {
                    if (slots[1] > 0) {
                        slots[1]--;
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if (slots[2] > 0) {
                        slots[2]--;
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }
}
