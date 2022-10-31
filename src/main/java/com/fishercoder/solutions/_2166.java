package com.fishercoder.solutions;

public class _2166 {
    public static class Solution1 {
        class Bitset {

            int size;
            int ones;
            int[] nums1;
            int[] nums2;
            boolean checkingNums1;

            public Bitset(int size) {
                this.nums1 = new int[size];
                this.nums2 = new int[size];
                for (int i = 0; i < size; i++) {
                    nums2[i] = 1;
                }
                this.ones = 0;
                this.size = size;
                this.checkingNums1 = true;
            }

            public void fix(int idx) {
                if (this.checkingNums1) {
                    if (nums1[idx] == 0) {
                        ones++;
                    }
                    nums1[idx] = 1;
                    nums2[idx] = 0;
                } else {
                    if (nums2[idx] == 0) {
                        ones++;
                    }
                    nums2[idx] = 1;
                    nums1[idx] = 0;
                }
            }

            public void unfix(int idx) {
                if (this.checkingNums1) {
                    if (nums1[idx] == 1) {
                        ones--;
                    }
                    nums1[idx] = 0;
                    nums2[idx] = 1;
                } else {
                    if (nums2[idx] == 1) {
                        ones--;
                    }
                    nums2[idx] = 0;
                    nums1[idx] = 1;
                }
            }

            public void flip() {
                this.ones = this.size - this.ones;
                this.checkingNums1 = !this.checkingNums1;
            }

            public boolean all() {
                return ones == size;
            }

            public boolean one() {
                return ones > 0;
            }

            public int count() {
                return ones;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                if (this.checkingNums1) {
                    for (int i = 0; i < size; i++) {
                        sb.append(nums1[i]);
                    }
                } else {
                    for (int i = 0; i < size; i++) {
                        sb.append(nums2[i]);
                    }
                }
                return sb.toString();
            }
        }
    }
}
