package stevesun.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.

 For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].
 */
public class MissingRanges {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<String>();

        // the next number we need to find
        long next = lower;
        long longUpper = (long) upper;
        if (nums.length == 0) {
            res.add(getRange(lower, longUpper));
            return res;
        }
        else if (nums.length == 1 && nums[0] == -2147483648 && lower == -2147483648 && upper == 2147483647){
            res.add(getRange(lower+1, longUpper));
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            // not within the range yet
            if (nums[i] < next) continue;

            // continue to find the next one
            if (nums[i] == next) {
                next++;
                continue;
            }

            // get the missing range string format
            res.add(getRange(next, nums[i] - 1));

            // now we need to find the next number
            if (nums[i] < Integer.MAX_VALUE) next = nums[i] + 1;
            else break;
        }

        // do a final check
        if (next > Integer.MIN_VALUE && next <= longUpper && longUpper < Integer.MAX_VALUE) res.add(getRange(next, longUpper));
        if (next == Integer.MIN_VALUE && longUpper == Integer.MAX_VALUE && nums.length == 0) res.add(getRange(next, longUpper));

        return res;
    }

    String getRange(long n1, long n2) {
        return (n1 == n2) ? String.valueOf(n1) : String.format("%d->%d", n1, n2);
    }
}
