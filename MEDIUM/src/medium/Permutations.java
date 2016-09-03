package medium;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static class Accepted_solution {
        //this solution has a recursive function that has a return type
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            result.add(new ArrayList<>());
            return recursive(result, nums, 0);
        }

        private static List<List<Integer>> recursive(List<List<Integer>> result, int[] nums,
                int pos) {
            if (pos == nums.length)
                return result;
            List<List<Integer>> newResult = new ArrayList();
            for (List<Integer> eachList : result) {
                for (int i = 0; i <= eachList.size(); i++) {
                    List<Integer> newList = new ArrayList(eachList);
                    newList.add(i, nums[pos]);
                    newResult.add(newList);
                }
            }
            result = newResult;
            return recursive(result, nums, pos + 1);
        }
    }
    
    static class Accepted_solution_with_void_type {
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            result.add(new ArrayList<>());
            recursive(result, nums, 0);
            return result;
        }

        private static void recursive(List<List<Integer>> result, int[] nums, int pos) {
            if(pos == nums.length) return;
            List<List<Integer>> newResult = new ArrayList();
            for(List<Integer> eachList : result){
                for(int i = 0; i <= eachList.size(); i++){
                    List<Integer> newList = new ArrayList(eachList);
                    newList.add(i, nums[pos]);
                    newResult.add(newList);
                }
            }
            /**You'll have to use the two lines, instead of this line: result = newResult; otherwise, it won't work!!! Fuck!*/
            result.clear();
            result.addAll(newResult);
            
            //then recursion
            recursive(result, nums, pos+1);
        }
    }
    
    public static void main(String...args){
        int[] nums = new int[]{1,2,2};
        
    }

}
