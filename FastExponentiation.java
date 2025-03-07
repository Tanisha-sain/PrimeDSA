import java.util.Scanner;

public class FastExponentiation {

    // x^y
    static long power(long x, long y, long m){
        if(y == 0) return 1;
        long ans = 1;
        long newY = y/2;
        if(y%2 == 1) ans = (ans%m * x%m)%m;
        long halfPower = power(x, newY, m);
        ans = (ans%m * halfPower%m)%m;
        ans = (ans%m * halfPower%m)%m;
        return ans;
    }

    static long flyingSaucerSegment(long n, long m){
        long pow =  (power(3, n, m)%m - 1%m + m)%m;
        return pow;
    }

    public static void main(String[] args) {
        // int a = 2;
        // int b = -1;
        
        // float temp = power(a, Math.abs(b));
        // if(b < 0) temp = 1/temp;
        // System.out.println(temp);
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(flyingSaucerSegment(n, m));
        sc.close();
    }
    
}