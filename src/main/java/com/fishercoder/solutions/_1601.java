class Solution {
    int max = 0;
    public int maximumRequests(int n, int[][] requests) {
        helper(requests, 0, new int[n], 0);
        return max;
    }
    
    private void helper(int[][] requests, int index, int[] count, int num) {
        // Traverse all n buildings to see if they are all 0. (means balanced)
        if (index == requests.length) {
            for (int i : count) {
                if (0 != i) {
                    return;
                }
            }
            max = Math.max(max, num);
            return;
        }
		// Choose this request
        count[requests[index][0]]++;
        count[requests[index][1]]--;
        helper(requests, index + 1, count, num + 1);
        count[requests[index][0]]--;
        count[requests[index][1]]++;
        
		// Not Choose the request
        helper(requests, index + 1, count, num);
    }
}