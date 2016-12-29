package stevesun.algorithms;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

 Example 1:
 nums1 = [1, 3]
 nums2 = [2]

 The median is 2.0
 Example 2:
 nums1 = [1, 2]
 nums2 = [3, 4]

 The median is (2 + 3)/2 = 2.5
 */
public class MedianofTwoSortedArrays {
    /**
     Reference: https://leetcode.com/discuss/28843/my-accepted-java-solution:
     Basic Idea is very similar to K-selection. it's easier to understand if you imagine this to be chopping off the last K elements from a total of len(A) + len(B) elements, where K = (len(A) + len(B))/2.
     we want to remove K, but each time we can remove only at most K/2 elements, because we can only be sure that these elements are not within the first (len(A) + len(B)) -K elements.
     */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int K = nums1.length + nums2.length;
        if (K%2 ==0 ) {
            return  (findMedianSortedArrays(nums1,nums2, (K - K/2))  +  findMedianSortedArrays(nums1,nums2, (K-(K/2+1))) )/2;
        }
        else{
            return  findMedianSortedArrays(nums1,nums2, K - (K/2+1));
        }
    }

    // k is the number of elements to REMOVE, or "Chop off"
    public double findMedianSortedArrays(int A[], int B[], int K) {

        int lowA=0, lowB=0;
        int highA=A.length; int highB= B.length;
        int midA; int midB;
        while(K>0 && highA >0 && highB > 0) {
            int chopA = max(1,min(K/2, (highA)/2));
            int chopB = max(1,min(K/2, (highB)/2));

            midA = highA-chopA;
            midB = highB-chopB;
            if (A[midA] <B[midB]) { // here A[0 .. midA] < B[midB], and we know that B[0 .. midB-1] < B[midB], so B[midB..highB] can not possibly be within the first (len(A) + len(B) - K) elements, and can be safely removed.
                highB = midB;
                K = K - chopB;
            }
            else {
                highA = midA ;
                K = K - chopA;
            }
        }

        if (highA == 0 && highB == 0 ) return 0;
        if (highA == 0) return B[highB-1-K];
        if (highB== 0) return A[highA-1-K];
        return max(A[highA-1], B[highB-1]);
    }

}
