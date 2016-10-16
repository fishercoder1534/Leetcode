package medium;

public class FindPeakElement {

    /**
     * On discuss, this post has very good explanation about an O(logn) solution:
     * https://discuss.leetcode.com/topic/29329/java-solution-and-explanation-using-invariants
     * 
     * Basically, we need to keep this invariant:
     * nums[left] > nums[left-1], then we could return left as the result
     * or nums[right] > nums[right+1], then we could return right as the result
     */
    public static int findPeakElement_Ologn(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        int left = 0, right = nums.length-1;
        while(left+1 < right){
            int mid = left + (right-left)/2;
            if(nums[mid] < nums[mid+1]){
                left = mid;
            } else {
                right = mid;
            }
        }
        return (left == nums.length-1 || nums[left] > nums[left+1]) ? left : right;
    
    }
    
    /**My original O(n) solution.*/
    public static int findPeakElement(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length, result = 0;
        for(int i = 0; i < n; i++){
            if(i == 0 && n > 1 && nums[i] > nums[i+1]){
                result = i;
                break;
            } else if(i == n-1 && i > 0 && nums[i] > nums[i-1]){
                result = i;
                break;
            } else if(i > 0 && i < n-1 && nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String...strings){
//        int[] nums = new int[]{1,2};
//        int[] nums = new int[]{1};
        int[] nums = new int[]{1,2,3,1};
//        System.out.println(findPeakElement(nums));
        System.out.println(findPeakElement_Ologn(nums));
    }
}
