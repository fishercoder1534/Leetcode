package stevesun.algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        char[] schar = s.toCharArray();
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            if(i > 0 && map.get(schar[i]) > map.get(schar[i-1])){
                result = result + map.get(schar[i]) - 2*map.get(schar[i-1]);
            } else {
                result = result + map.get(schar[i]);
            }
        }
        return result;
    }

}
