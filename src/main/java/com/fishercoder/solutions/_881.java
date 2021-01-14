package com.fishercoder.solutions;

public class _881 {
    public static class Solution1 {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int end = people.length - 1;
            int start = 0;
            int boatcount = 0;
            while (end >= start) {
                if (people[end] == limit) {
                    end--;
                    boatcount++;
                } else if (people[end] + people[start] <= limit) {
                    start++;
                    end--;
                    boatcount++;
                } else {
                    end--;
                    boatcount++;
                }
            }
            return boatcount;
        }
    }
}
