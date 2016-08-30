package easy;

import java.util.HashSet;
import java.util.Set;

public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        Set<Character> set = new HashSet();
        set.add('0');
        set.add('1');
        set.add('6');
        set.add('8');
        set.add('9');
        char[] nums = num.toCharArray();
        int i = 0, j = num.length()-1;
        while(i <= j){
            if(!set.contains(nums[i]) || !set.contains(nums[j])) return false;
            if(nums[i] == '6' && nums[j] != '9') return false;
            else if(nums[i] == '9' && nums[j] != '6') return false;
            else if(nums[i] == '1' && nums[j] != '1') return false;
            else if(nums[i] == '8' && nums[j] != '8') return false;
            else if(nums[i] == '0' && nums[j] != '0') return false;
            else {
                i++; j--;
            }
        }
        return true;
    }
}
