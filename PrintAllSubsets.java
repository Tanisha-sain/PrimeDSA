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
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printSubsets(arr, new ArrayList<>(), 0);
    }
}
