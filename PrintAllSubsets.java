import java.lang.reflect.Array;
import java.util.*;
public class PrintAllSubsets {
    static void printSubsets(int[] arr, ArrayList<Integer> temp, int index){
        if(index == arr.length){
            System.out.println(temp);
            return;
        }
        temp.add(arr[index]);
        printSubsets(arr, temp, index+1);
        temp.remove(temp.size()-1);
        printSubsets(arr, temp, index+1);
    }

    static int[] generateBitMap(int num, int len){
        int[] bits = new int[len];
        for(int i = len-1; i>=0; i--){
            bits[i] = num%2;
            num = num/2;
        }
        return bits;
    }
    static void subsetsBitmask(int[] arr){
        int n = arr.length;
        int range = (int)Math.pow(2, n);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp;
        for(int i = 0; i<range; i++){
            int[] bits = generateBitMap(i, n);
            temp = new ArrayList<>();
            for(int j = 0; j<n; j++){
                if(bits[j] == 1){
                    temp.add(arr[j]);
                }
            }
            // System.out.println(temp);
            ans.add(temp);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // printSubsets(arr, new ArrayList<>(), 0);
        subsetsBitmask(arr);
    }
}
