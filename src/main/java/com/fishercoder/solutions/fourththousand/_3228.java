package com.fishercoder.solutions.fourththousand;

public class _3228 {
    public static class Solution1 {
        /*
         * This is literal simulation and swap the 1s and 0s, but ended up in TLE, so you'll have to do better.
         */
        public int maxOperations(String s) {
            char[] arr = s.toCharArray();
            int len = arr.length;
            int maxOps = 0;
            int oneIndex = 0;
            int zeroIndex = 0;
            while (oneIndex < len && arr[oneIndex] == '0') {
                oneIndex++;
            }
            // now we found the first one, then we'll have to find the last one in case there's a
            // consecutive group of 1's
            int firstOneOccurrence = oneIndex;
            while (oneIndex < len && zeroIndex < len) {
                while (oneIndex < len && arr[oneIndex] == '1') {
                    oneIndex++;
                }
                oneIndex--;

                zeroIndex = oneIndex;
                while (zeroIndex < len && arr[zeroIndex] == '1') {
                    zeroIndex++;
                }
                // likewise, we need to find the last occurrence of 0 in case there's a group of
                // consecutive 0's
                while (zeroIndex < len && arr[zeroIndex] == '0') {
                    zeroIndex++;
                }
                if (zeroIndex >= len && arr[zeroIndex - 1] == '1') {
                    return maxOps;
                }
                int nextBeginOneIndex = zeroIndex;
                zeroIndex--;

                int ops = 0;
                do {
                    int[] swappedIndex = swap(arr, zeroIndex, oneIndex);
                    oneIndex = swappedIndex[0];
                    zeroIndex = swappedIndex[1];
                    ops++;
                } while (oneIndex >= firstOneOccurrence);
                maxOps += ops;
                firstOneOccurrence = zeroIndex + 1;
                oneIndex = nextBeginOneIndex;
            }
            return maxOps;
        }

        private int[] swap(char[] arr, int zeroIndex, int oneIndex) {
            char tmp = arr[zeroIndex];
            arr[zeroIndex] = arr[oneIndex];
            arr[oneIndex] = tmp;
            return new int[] {oneIndex - 1, zeroIndex - 1};
        }
    }

    public static class Solution2 {
        /*
         * TODO: finish this.
         */
        public int maxOperations(String s) {
            int maxOps = 0;
            return maxOps;
        }
    }
}
