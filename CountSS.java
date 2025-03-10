import java.util.*;
public class CountSS {

    /// Combination Sum ------------------------------------
    static void helper(List<List<Integer>> ans, List<Integer> temp, int curr_sum, int index, int[] candidates){
        if(index == candidates.length){
            if(curr_sum == 0){
                ans.add(new ArrayList<>(temp));
                return;
            }
            return;
        }
        int picks = curr_sum/candidates[index];
        for(int i = 0; i<=picks; i++){
            helper(ans, temp, curr_sum, index+1, candidates);
            curr_sum -= candidates[index];
            temp.add(candidates[index]);
        }
        for(int i = 0; i<=picks; i++){
            // curr_sum += candidates[index];
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), target, 0, candidates);
        return ans;
    }
/// ----------------------------------------------------------


    static int countSubsets(ArrayList<Integer> arr, int sum, int index){
        if(index == arr.size()){
            if(sum == 0) return 1;
            else return 0;
        }
        int x = (sum-arr.get(index) >= 0) ? countSubsets(arr, sum-arr.get(index), index+1) : 0;
        int y = countSubsets(arr, sum, index+1);
        return x+y;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(3);
        // arr.add(10);
        // arr.add(5);
        // System.out.println(countSubsets(arr, 8, 0));
        // System.out.println(countSubsets(arr, 20, 0));
        // System.out.println(countSubsets(arr, 13, 0));
        int[] arr = {3, 5, 10};
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), 8, 0, arr);
        System.out.println(ans.size());
        ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), 20, 0, arr);
        System.out.println(ans.size());
        ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), 13, 0, arr);
        System.out.println(ans.size());
    }
}
