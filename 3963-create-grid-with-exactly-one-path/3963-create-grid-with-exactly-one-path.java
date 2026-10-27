class Solution {
    public String[] createGrid(int m, int n) {
        char[][] a = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = '#';
            }
        }

        for(int j=0;j<n;j++){
            a[0][j] = '.';
        }
        for(int i=1;i<m;i++){
            a[i][n-1] = '.';
        }

        String[] ans = new String[m];
        for(int i=0;i<m;i++){
            ans[i] = new String(a[i]);
        }
        return ans;

    }
}