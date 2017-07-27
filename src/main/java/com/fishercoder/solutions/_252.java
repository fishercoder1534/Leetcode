package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
 * determine if a person could attend all meetings.

 For example,
 Given [[0, 30],[5, 10],[15, 20]],
 return false.*/
public class _252 {
    public boolean canAttendMeetings(Interval[] intervals) {
        
        List<Interval> list = new ArrayList();
        for(Interval interval : intervals){
            list.add(interval);
        }
        
        Collections.sort(list, new Comparator<Interval>(){

            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start > o2.start) return 1;
                else return -1;
            }
            
        });
        
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i).end > list.get(i+1).start) return false;
        }
        return true;
    
    }
}
