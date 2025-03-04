import java.util.*;
public class RationalResistance {
    static long minResistors(long a, long b){
        if(a== 0 || b == 0) return 0;
        if(a >= b){
            return (a/b) + minResistors(a%b, b);
        }
        return (b/a) + minResistors(a, b%a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = minResistors(a,b);
        System.out.println(ans);
        sc.close();
    }
}
