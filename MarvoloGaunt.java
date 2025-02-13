
import java.util.*;
public class MarvoloGaunt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        long[] preMax = new long[n];
        preMax[0] = (long)p*arr[0];
        for(int i = 1; i<n; i++){
            preMax[i] = Math.max(preMax[i-1], (long)p*arr[i]);
        }
 
        long sMax = Long.MIN_VALUE;
        // int[] sufMax = new int[n];
        // sufMax[n-1] = r*arr[n-1];
        // for(int i = n-2; i>=0; i--){
        //     sufMax[i] = Math.max(sufMax[i+1], r*arr[i]);
        // }
        
        long ans = Long.MIN_VALUE;
        // for(int i = 0; i<n; i++){
        //     int val1 = preMax[i];
        //     int val3 = sufMax[i];
        //     int val2 = q*arr[i];
        //     ans = Math.max(ans, val1+val2+val3);
        // }
        for(int i = n-1; i>=0; i--){
            long val1 = preMax[i];
            long val2 = (long)q*arr[i];
            sMax = Math.max(sMax, (long)r*arr[i]);
            long val3 = sMax;
            ans = Math.max(ans, val1 + val2 + val3);
        }
        
        System.out.println(ans);
 
    }
}