package package1;
//Given a sorted array and a target, return the index of the target in this array, return -1 if not found.
public class BinarySearch {

	
	//if not found in array, return -1;
	public static int binarySearch(int[] nums, int target){
		if(nums == null || nums.length == 0) return -1;
		
		int left = 0, right = nums.length-1;
		if(nums[right] < target || nums[left] > target) return -1;
		
		while(left+1 < right){
			int mid = left + (right-left)/2;
			if(nums[mid] == target) return mid;
			else if(nums[mid] > target){
				right = mid;
			} else {
				left = mid;
			}
		}
		if(nums[left] == target) return left;
		else if(nums[right] == target) return right;
		return -1;
	}
	
	public static void main(String...strings){
		
		
		
		//test case 1:
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9};//lenght = 9, 9/2 = 4
//		int target = 7;
		
//		test case 2:
//		int target = 10;
		
		//test case 3:
//		int target = -2;
		
//		int target = 1;
		int target = 9;
		
		System.out.println(binarySearch(nums, target));
		
	}
}
