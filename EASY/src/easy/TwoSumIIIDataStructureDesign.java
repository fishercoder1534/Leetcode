package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Your TwoSum object will be instantiated and called as such:
//TwoSum twoSum = new TwoSum();
//twoSum.add(number);
//twoSum.find(value);
public class TwoSumIIIDataStructureDesign {
    private Map<Integer, Integer> map = new HashMap();
    private List<Integer> list = new ArrayList();
    
 // Add the number to an internal data structure.
    public void add(int number) {
        list.add(number);
        map.put(number, map.getOrDefault(number, 0)+1);
    }

    // Find if there exists any pair of numbers which sum is equal to the value.
    public boolean find(int value) {
        for(int i = 0; i < list.size(); i++){
            int val1 = list.get(i);
            int val2 = value-val1;
            if(map.containsKey(val2)) {
                if(val1 == val2) {
                    if(map.get(val2) > 1) return true;
                }
                else return true;
            }
        }
        return false;
    }
}
