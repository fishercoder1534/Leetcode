package com.fishercoder.solutions;

public class _1826 {
    public static class Solution1 {
        public int badSensor(int[] sensor1, int[] sensor2) {
            //check if sensor2 is faulty
            int i = 0, j = 0;
            for (; i < sensor1.length && j < sensor2.length - 1; ) {
                if (sensor1[i] != sensor2[j]) {
                    i++;
                } else {
                    i++;
                    j++;
                }
            }
            boolean sensor2Faulty = false;
            if (j == sensor2.length - 1 && i == sensor1.length) {
                sensor2Faulty = true;
            }
            //check sensor1
            i = 0;
            j = 0;
            for (; i < sensor1.length - 1 && j < sensor2.length; ) {
                if (sensor1[i] != sensor2[j]) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            boolean sensor1Faulty = false;
            if (i == sensor1.length - 1 && j == sensor2.length) {
                sensor1Faulty = true;
            }
            if (sensor1Faulty && sensor2Faulty) {
                return -1;
            } else if (sensor1Faulty) {
                return 1;
            } else if (sensor2Faulty) {
                return 2;
            }
            return -1;
        }
    }
}
