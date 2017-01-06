package com.stevesun.solutions;

public class MergeSortedArray {

    /**I used O(m) extra space to create a temp array, but this could be avoided.*/
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for(int i = 0; i < m; i++) temp[i] = nums1[i];
        for(int i = 0, j = 0, k = 0; i < m || j < n;){
            if(i == m){
                for(; j < n;){
                    nums1[k++] = nums2[j++];
                }
                break;
            }
            if(j == n){
                for(; i < m;){
                    nums1[k++] = temp[i++];
                }
                break;
            }
            
            if(temp[i] > nums2[j]){
                nums1[k++] = nums2[j++];
            } else {
                nums1[k++] = temp[i++];
            }
        }
    }

    public static void main(String...args){
//        int[] nums1 = new int[]{2,0};
//        int m = 1;
//        int[] nums2 = new int[]{1};
//        int n = 1;
        
        int[] nums1 = new int[]{4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{1,2,3};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
