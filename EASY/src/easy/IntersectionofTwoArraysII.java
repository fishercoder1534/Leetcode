package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
