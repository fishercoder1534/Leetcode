package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.CommonUtils;
import classes.Interval;

public class FindRightInterval {

    public static int[] findRightInterval(Interval[] intervals) {
        if(intervals == null || intervals.length == 0) return new int[0];
        int[] result = new int[intervals.length];
        result[0] = -1;
        Interval last = intervals[intervals.length-1];
        Interval first = intervals[0];
        Map<Interval, Integer> map = new HashMap();
        for(int i = 0; i < intervals.length; i++){
            map.put(intervals[i], i);
        }
        
        Collections.sort(Arrays.asList(intervals), new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        
        for(int i = 1; i < intervals.length; i++){
            //TODO: use binary search for the minimum start interval for interval[i-1] instead of a while loop
            int tmp = i-1, tmpI = i;
            while(tmpI < intervals.length && intervals[tmpI].start < intervals[tmp].end) tmpI++;
            if(tmpI < intervals.length) result[map.get(intervals[tmp])] = map.get(intervals[tmpI]);
            else result[map.get(intervals[tmp])] = -1;
        }
        if(result[intervals.length-1] == 0 && last.end > first.start) result[intervals.length-1] = -1;
        return result;
    }

    
    public static void main(String...args){
        Interval[] intervals = new Interval[3];
//        intervals[0] = new Interval(1,4);
//        intervals[1] = new Interval(2,3);
//        intervals[2] = new Interval(3,4);
        
        intervals[0] = new Interval(3,4);
        intervals[1] = new Interval(2,3);
        intervals[2] = new Interval(1,2);
        findRightInterval(intervals);
    }
}
