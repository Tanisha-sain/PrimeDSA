import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintSubsetsLexicographically {
    static void printSubsLexico(ArrayList<Integer> temp, int index, int[] arr){
        System.out.println(temp);
        if(index == arr.length){
            return;
        }
        for(int i = index; i<arr.length; i++){
            temp.add(arr[i]);
            printSubsLexico(temp, i+1, arr);
            temp.remove(temp.size()-1);
        }
    }
    static void helper(int dig, int low, int high, List<Integer> ans, int number){
        if(number > high) return;
        if(number >= low){
            ans.add(number);
        }
        if(dig > 9) return;
        helper(dig+1, low, high, ans, number*10+dig);
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i<9; i++){
            helper(i, low, high, ans, 0);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        // printSubsLexico(new ArrayList<>(), 0, new int[]{1, 2, 3, 4});
        System.out.println(sequentialDigits(234, 2314));
    }
}
