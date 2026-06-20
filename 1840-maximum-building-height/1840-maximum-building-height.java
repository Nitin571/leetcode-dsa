class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        int m = restrictions.length;
        int[][] arr = new int[m + 2][2];

        arr[0][0] = 1;
        arr[0][1] = 0;

        for(int i=0;i<m;i++){
            arr[i+1][0] = restrictions[i][0];
            arr[i+1][1] = restrictions[i][1];
        }

        arr[m+1][0] = n;
        arr[m+1][1] = n-1;

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 1; i < arr.length; i++) {
            int dist = arr[i][0] - arr[i - 1][0];
            arr[i][1] = Math.min(arr[i][1],arr[i - 1][1] + dist);
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            int dist = arr[i + 1][0] - arr[i][0];
            arr[i][1] = Math.min(arr[i][1],arr[i + 1][1] + dist);
        }

        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            int d = arr[i][0] - arr[i - 1][0];
            int h1 = arr[i - 1][1];
            int h2 = arr[i][1];
            int peak = (h1 + h2 + d) / 2;
            ans = Math.max(ans, peak);
        }
        return ans;

    }
}