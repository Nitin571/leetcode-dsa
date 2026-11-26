class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++) {
            if(grid[i][0] == 0) {
                for(int j = 0; j < n; j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        int score = 0;
        for(int j=0;j<n;j++){
            int ones = 0;
            for(int i=0;i<m;i++){
                if(grid[i][j] == 1){
                    ones++;
                }
            }
            ones = Math.max(ones,m-ones);
            score += ones * (1 << (n - 1 - j));
        }
        return score;
    }
}