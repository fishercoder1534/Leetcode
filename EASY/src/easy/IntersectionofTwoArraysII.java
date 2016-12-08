package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

 Note:
 Each element in the result should appear as many times as it shows in both arrays.
 The result can be in any order.
 Follow up:
 What if the given array is already sorted? How would you optimize your algorithm?
 What if nums1's size is small compared to nums2's size? Which algorithm is better?
 What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 Show Tags
 Show Similar Problems
 */
public class IntersectionofTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap();
        for(int i : nums1){
            if(map1.containsKey(i)){
                map1.put(i, map1.get(i)+1);
            } else {
                map1.put(i, 1);
            }
        }
        
        List<Integer> list = new ArrayList();
        for(int i : nums2){
            if(map1.containsKey(i) && map1.get(i) > 0){
                list.add(i);
                map1.put(i, map1.get(i)-1);
            }
        }
        
        int[] result = new int[list.size()];
        int i = 0;
        for(int num : list){
            result[i++] = num;
        }
        
        return result;
    }

}
