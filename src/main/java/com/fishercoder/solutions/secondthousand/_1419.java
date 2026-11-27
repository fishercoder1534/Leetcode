package com.fishercoder.solutions.secondthousand;

public class _1419 {
    public static class Solution1 {
        public int minNumberOfFrogs(String croakOfFrogs) {
            int[] count = new int[5];
            int activeFrogs = 0;
            int frogsNeeded = 0;
            for (int i = 0; i < croakOfFrogs.length(); i++) {
                char c = croakOfFrogs.charAt(i);
                int index = "croak".indexOf(c);
                if (index == 0) {
                    //this is 'c', we'll have to either add a new frog or find one that's finished croaking
                    if (count[4] > 0) {
                        //we can reuse a frog that finished croaking
                        count[4]--;
                    } else {
                        //we'll need an additional frog
                        frogsNeeded++;
                    }
                    count[0]++;
                    activeFrogs++;
                } else {
                    //this is 'r', 'o', 'a' or 'k'
                    //must have an immediately preceding character
                    if (count[index - 1] == 0) {
                        return -1;
                    }
                    count[index - 1]--;
                    count[index]++;

                    if (index == 4) {
                        //this is 'k' which means one frog is freed up after this character
                        activeFrogs--;
                    }
                }
            }
            return activeFrogs == 0 ? frogsNeeded : -1;
        }
    }
}
