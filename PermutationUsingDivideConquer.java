import java.util.*;
public class PermutationUsingDivideConquer {
    static List<List<Integer>> getPerms(int[] arr, int ind,  List<List<Integer>> ans){
        if(ind == -1) return ans;
        int size = ans.size();
        List<List<Integer>> temp1 = new ArrayList<>();
        if(size == 0){
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[ind]);
            temp1.add(temp);
        }
        for(int i = 0; i<size; i++){
            List<Integer> temp = ans.get(i);
            for(int j = 0; j<=temp.size(); j++){
                temp.add(j, arr[ind]);
                temp1.add(new ArrayList<>(temp));
                temp.remove(j);
            }
        }
        return getPerms(arr, ind-1, temp1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<List<Integer>> ans = new ArrayList<>();
        ans = getPerms(arr, 3, ans);
        System.out.println(ans);
    }
}
