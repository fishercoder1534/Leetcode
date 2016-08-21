package _20160820_1st_contest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> countsMap = new HashMap();
        Map<Character, Integer> indexMap = new HashMap();
        Set<Character> uniqSet = new HashSet();
        for(int i = 0; i < s.length(); i++){
            if(!countsMap.containsKey(s.charAt(i))){
                countsMap.put(s.charAt(i), 1);
                indexMap.put(s.charAt(i), i);
                uniqSet.add(s.charAt(i));
            } else {
                int currVal = countsMap.get(s.charAt(i));
                countsMap.put(s.charAt(i), currVal+1);
                uniqSet.remove(s.charAt(i));
            }
        }
        int index = Integer.MAX_VALUE;
        for(char c : uniqSet){
            if(indexMap.get(c) < index) index = indexMap.get(c);
        }
        return (index == Integer.MAX_VALUE) ? -1 : index;
    }
    
    public static int firstUniqChar_dropped(String s) {
        //TODO: deal with extreme test case
        Map<Character, Integer> map = new HashMap();
        //use a priorityqueue to hold all candidates, remove it from the pq once it becomes invalid
        Queue<Map.Entry<Character, Integer>> heap = new PriorityQueue<Map.Entry<Character, Integer>>(new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
                if(o1.getValue() > o2.getValue()) return 1;
                else if(o1.getValue() < o2.getValue()) return -1;
                else return 0;
            }
        });
        
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            } else {
                int currVal = map.get(s.charAt(i));
                map.put(s.charAt(i), currVal+1);
            }
        }
        
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            heap.offer(e);
        }
        
        while(!heap.isEmpty()){
            Map.Entry<Character, Integer> curr = heap.poll();
            if(map.get(curr.getKey()) > 1) continue;
            else return map.get(curr.getKey());
        }
        return -1;
    }
    
    public static void main(String...strings){
//        String s = "leetcode";
//        String s = "loveleetcode";
//        String s = "";
        String s = "fd.fsfew@#$%d";
        System.out.println(firstUniqChar(s));
    }
}
