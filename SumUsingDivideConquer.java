public class SumUsingDivideConquer {

    // TC - O(N) [2N - 1]
    // SC - O(log2N)
    static int sum(int i, int j, int[] arr){
        if(i == j) return arr[i];
        int mid = i + (j-i)/2;
        return sum(i, mid, arr) + sum(mid+1, j, arr);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 2, 3, 2, 1, 1};
        System.out.println(sum(0, arr.length-1, arr));
    }
}
