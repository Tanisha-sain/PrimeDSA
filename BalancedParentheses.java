public class BalancedParentheses {
    static void generateBalancedParentheses(int n, int open, int close, StringBuilder sb){
        if(open < close || open > n) return;
        if(open == n){
            if(open == close){
                System.out.println(sb);
                return;
            }
        }

        if(open >= close){
            sb.append("(");
            generateBalancedParentheses(n, open+1, close, sb);
            sb.deleteCharAt(sb.length() - 1);
            sb.append(")");
            generateBalancedParentheses(n, open, close+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public static void main(String[] args) {
        generateBalancedParentheses(4, 0, 0, new StringBuilder());
    }
}
