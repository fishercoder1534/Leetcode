package chapter2_binary_search;

public class FirstBadVersion {
    
    private static class SVNRepo{
        //this is a fake method to make this class happy in Eclipse.
        public static boolean isBadVersion(int n){
            return false;
        }
    }

    /**
     * @param n: An integers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion_solution1(int n) {
        // write your code here
        if (n == 1) return n;
        int left = 1, right = n;
        while(left+1 < right){
            int mid = left + (right-left)/2;
            if(!SVNRepo.isBadVersion(mid)) left = mid;
            else right = mid;
        }
        if(SVNRepo.isBadVersion(left)) return left;
        return right;
    }
    
    public int findFirstBadVersion_solution2(int n) {
        // write your code here
        int left = 1, right = n;
        while(left+1 < right){
            int mid = left + (right-left)/2;
            if(!SVNRepo.isBadVersion(mid)) left = mid;
            else right = mid;
        }
        if(left != right){
            if(!SVNRepo.isBadVersion(left)){
                if(SVNRepo.isBadVersion(right)) return right;
                else return -1;
            } else return left;
        }
        if(SVNRepo.isBadVersion(left)) return left;
        return -1;
    }


}
