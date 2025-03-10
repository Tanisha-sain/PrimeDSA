public class DistinctPaths {
    static int countPaths(int i, int j, int n, int m){
        // if(i >= n || j >= m) return 0;
        // if(i == n-1 && j == m-1) return 1;
        if(i == n-1 || j == m-1) return 1;
        return countPaths(i, j+1, n, m) + countPaths(i+1, j, n, m);
    }
    static int countPathsTabulation(int n, int m){
        int[][] grid = new int[n][m];
        for(int i = 0; i<n; i++){
            grid[i][0] = 1;
        }
        for(int j = 0; j<m; j++){
            grid[0][j] = 1;
        }
        for(int i = 1; i<n; i++){
            for(int j = 1; j<m; j++){
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }
        return grid[n-1][m-1];
    }
    public static void main(String[] args) {
        // System.out.println(countPaths(0, 0, 3, 3));
        System.out.println(countPathsTabulation(1, 3));
    }
}
