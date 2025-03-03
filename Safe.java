import java.util.*;
public class Safe {
    static class Pair{
        String s;
        int c;
        Pair(String s, int c){
            this.s = s;
            this.c = c;
        }
    }

    static void generateString(StringBuilder str, int count, int index, ArrayList<String> ans){
        // System.out.println(str + " " + count + " " + index);
        if(index > str.length()) return;
        if(index == str.length()){
            if(count == 0){
                ans.add(new String(str));
            }
            return;
        }
        if(count > 0){
            generateString(str, count-1, index+1, ans);
        }
        if(str.charAt(index) == '1'){
            str.setCharAt(index, '0');
        }else{
            str.setCharAt(index, '1');
        }
        generateString(str, count, index+1, ans);
        if(str.charAt(index) == '1'){
            str.setCharAt(index, '0');
        }else{
            str.setCharAt(index, '1');
        }
    }

    static boolean verify(String s1, String s2, int k){
        int count = 0;
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)) count++;
        }
        return count == k;
    }
    static ArrayList<String> filter(ArrayList<String> ans, String s, int c, ArrayList<String> temp){
        for(String curr : ans){
            if(verify(curr, s, c)) temp.add(curr);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Pair[] inp = new Pair[m];
        for(int i = 0; i<m; i++){
            String s = sc.next();
            int c = sc.nextInt();
            inp[i] = new Pair(s, c);
        }
        ArrayList<String> ans = new ArrayList<>();
        generateString(new StringBuilder(inp[0].s), inp[0].c, 0, ans);
        // System.out.println(ans);
        for(int i = 1; i<m; i++){
            ans = filter(ans, inp[i].s, inp[i].c, new ArrayList<>());
        }
        System.out.println(ans.size());
        sc.close();
    }
}
