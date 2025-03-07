// import java.util.*;
public class TowerOfHanoi {
    static void toh(int n, int s, int m, int d){
        if(n == 1){
            System.out.println(s + " -> " + d);
            return;
        }
        toh(n-1, s, d, m);
        toh(1, s, m, d);
        toh(n-1, m, s, d);
    }
    static void tohFSS(int n, int a, int b, int c, int[] count){
        if(n == 1){
            System.out.println(c + " -> " + a);
            count[0]++;
            return;
        }
        tohFSS(n-1, b, a, c, count);
        tohFSS(n-1, a, c, b, count);
        tohFSS(1, b, a, c, count);
        tohFSS(n-1, b, c, a, count);
        tohFSS(n-1, c, b, a, count);
        tohFSS(1, a, c, b, count);
        tohFSS(n-1, b, a, c, count);
        tohFSS(n-1, a, c, b, count);
    }
    public static void main(String[] args) {
        int[] count = {0};
        tohFSS(3, 1, 2, 3, count);
        // System.out.println(count[0]%8);
        System.out.println(count[0]);
    }
}
