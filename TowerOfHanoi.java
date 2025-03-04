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
    public static void main(String[] args) {
        toh(4, 1, 2, 3);
    }
}
