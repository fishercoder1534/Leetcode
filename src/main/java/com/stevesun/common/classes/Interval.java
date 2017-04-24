package com.stevesun.common.classes;

/**This is a class used by one OJ problem: MeetingRooms*/
public class Interval implements Comparable<Interval> {
    public int start;
    public int end;

    public Interval() {
        start = 0;
        end = 0;
    }
    
    public Interval(int s, int e){
        this.start = s;
        this.end = e;
    }

    @Override
    public int compareTo(Interval o) {
        int compareStart = o.start;
        //ascending order
        return this.start - compareStart;
    }

    @Override
    public String toString() {
        return "Interval [start=" + start + ", end=" + end + "]";
    }
}
