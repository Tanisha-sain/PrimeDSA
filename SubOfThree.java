import java.util.*;
public class SubOfThree {
    public static int countPalindrome(String s){
        int n = s.length();
        int[] prefFreq = new int[10];
        int[] suffFreq = new int[10];

        if(n != 0) prefFreq[s.charAt(0) - '0']++;
        for(int i = 2; i<n; i++){
            suffFreq[s.charAt(i) - '0']++;
        }

        int count = 0;
        for(int i = 1; i<n-1; i++){
            for(int j = 0; j<10; j++){
                int x = prefFreq[j];
                int y = suffFreq[j];
                count += x*y;
            }
            prefFreq[s.charAt(i) - '0']++;
            suffFreq[s.charAt(i+1) - '0']--;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = countPalindrome(s);
        System.out.println(ans);
        sc.close();
    }
}
