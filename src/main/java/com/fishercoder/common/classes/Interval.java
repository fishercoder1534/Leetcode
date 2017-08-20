package com.fishercoder.common.classes;

/**
 * This is a class used by one OJ problem: MeetingRooms
 */
public class Interval implements Comparable<Interval> {
    public int start;
    public int end;

    public Interval() {
        start = 0;
        end = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Interval)) {
            return false;
        }

        Interval interval = (Interval) o;

        if (start != interval.start) {
            return false;
        }
        return end == interval.end;
    }

    @Override
    public int hashCode() {
        int result = start;
        result = 31 * result + end;
        return result;
    }

    public Interval(int s, int e) {

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
