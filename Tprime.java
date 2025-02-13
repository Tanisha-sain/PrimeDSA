import java.util.*;

public class Tprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long max = Long.MIN_VALUE;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLong();
            if(arr[i] > max) max = arr[i];
        }
        int root = (int)Math.ceil(Math.sqrt(max));
        int[] tprimes = new int[root+1];
        tprimes[0] = -1;
        tprimes[1] = -1;
        // System.out.println(root);
        for(int i = 2; i<=root; i++){
            if(tprimes[(int)i] == 0){
                for(int j = i; (long)j*i<=root; j++){
                    // System.out.println(i + " * " + j + " = " + i*j);
                    tprimes[(int)((long)i*j)] = -1;
                }
            }
        }
        // System.out.println(Arrays.toString(tprimes));
        for(int i = 0; i<n; i++){
            long srt = (long)Math.sqrt(arr[i]);
            if(srt*srt == arr[i] && tprimes[(int)srt] == 0){
                // System.out.println(srt + " " + srt*srt + " " + arr[i] + " YES");
                System.out.println("YES");
            }else{
                // System.out.println(srt + " " + srt*srt + " " + arr[i] + " NO");
                System.out.println("NO");
            }
        }
    }
}
