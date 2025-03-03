public class Rec1 {
    static int count = 0;
    static void func(int i, int j, int M, int N){
        count++;
        if(i >= M || j >= N) return;
        if(i == M-1 && j == N-1) return;
        func(i, j+1, M, N);
        func(i+1, j, M, N);
    }
    public static void main(String[] args) {
        func(0, 0, 3, 3);
        System.out.println(count);
    }
}
