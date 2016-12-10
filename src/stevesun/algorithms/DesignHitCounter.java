package stevesun.algorithms;

public class DesignHitCounter {

}

class HitCounter {
    /**Looked at this post: https://discuss.leetcode.com/topic/48758/super-easy-design-o-1-hit-o-s-gethits-no-fancy-data-structure-is-needed,
     * I added one more field k to make it more generic.*/
    private int[] times;
    private int[] hits;
    private int k;
    
    /** Initialize your data structure here. */
    public HitCounter() {
        k = 300;
        times = new int[k];
        hits = new int[k];
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        int index = timestamp % k;
        if (times[index] != timestamp){
            times[index] = timestamp;
            hits[index] = 1;
        } else {
            hits[index]++;
        }
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        int total = 0;
        for (int i = 0; i < k; i++){
            if (timestamp - times[i] < k){
                total += hits[i];
            }
        }
        return total;
    }
}