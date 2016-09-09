package chapter2_binary_search;

import utils.CommonUtils;

public class SearchforaRange {

    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public static int[] searchRange(int[] A, int target) {
        // write your code here
        int left = 0, right = A.length-1;
        int[] result = new int[]{-1, -1};
        if(A == null || A.length == 0) return result;
        while(left +1 < right){
            int mid = left + (right-left)/2;
            if(A[mid] == target){
                int temp = mid;
                while(temp-1 >= 0 && A[temp] == A[temp-1]) temp--;
                result[0] = temp;
                while(mid+1 < A.length && A[mid] == A[mid+1]) mid++;
                result[1] = mid;
                return result;
            } else if(A[mid] > target){
                right = mid;
            } else {
                left = mid;
            }
        }
        if(A[left] == target){
            result[0] = left;
            result[1] = left;
        }
        if(A[right] == target){
            result[0] = right;
            result[1] = right;
        }
        return result;
    }
    
    public static void main(String...strings){
//        int[] A = new int[]{9,10,100,101,1002,10203};
//        int target = 10203;
        
        int[] A = new int[]{5,5,5,5,5,5,5,5,5,5};
        int target = 5;
        int[] result = searchRange(A, target);
        CommonUtils.printArray(result);
    }
}
