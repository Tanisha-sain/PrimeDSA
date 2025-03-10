import java.util.*;
public class LetterCombination {
    static int letterCombs(String numbers, List<List<Character>> digits, int index, StringBuilder sb){
        if(index == numbers.length()){
            System.out.println(sb);
            return 1;
        }
        int num = numbers.charAt(index) - '0';
        if(num == 1){
            letterCombs(numbers, digits, index+1, sb);
            return 1;
        }
        int ans = 1;
        for(char ch : digits.get(num-1)){
            sb.append(ch);
            ans = ans * letterCombs(numbers, digits, index+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<List<Character>> digits = new ArrayList<>();
        for(int i = 0; i<9; i++){
            digits.add(new ArrayList<>());
        }
        digits.get(1).add('a');
        digits.get(1).add('b');
        digits.get(1).add('c');

        digits.get(2).add('d');
        digits.get(2).add('e');
        digits.get(2).add('f');

        digits.get(3).add('g');
        digits.get(3).add('h');
        digits.get(3).add('i');

        digits.get(4).add('j');
        digits.get(4).add('k');
        digits.get(4).add('l');

        digits.get(5).add('m');
        digits.get(5).add('n');
        digits.get(5).add('o');

        digits.get(6).add('p');
        digits.get(6).add('q');
        digits.get(6).add('r');
        digits.get(6).add('s');

        digits.get(7).add('t');
        digits.get(7).add('u');
        digits.get(7).add('v');

        digits.get(8).add('w');
        digits.get(8).add('x');
        digits.get(8).add('y');
        digits.get(8).add('z');

        System.out.println(letterCombs("142", digits, 0, new StringBuilder()));
    }
}
