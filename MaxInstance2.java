import java.util.*;
public class MaxInstance2 {
    static void helper(ArrayList<Integer> temp, int[] arr, int index){
        if(index == arr.length){
            System.out.println(temp);
            return;
        }
        helper(temp, arr, index+1);
        temp.add(arr[index]);
        helper(temp, arr, index+1);
        temp.add(arr[index]);
        helper(temp, arr, index+1);
        temp.remove(temp.size()-1);
        temp.remove(temp.size()-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2};
        helper(new ArrayList<>(), arr, 0);
    }
}
