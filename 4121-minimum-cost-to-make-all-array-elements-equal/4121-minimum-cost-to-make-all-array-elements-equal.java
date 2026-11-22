class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;
        long ans = Long.MAX_VALUE;

        if(n == 1){
            return 0;
        } 
        int i = 0;

        while(i < n){
            int j = i;

            while(j + 1 < n && nums[j] == nums[j+1]) {
                j++;
            }

            if(i <= n-2 && j >= 1){
                long cost = (long)i * nums[i] + (long)(n - 1 - j) * nums[i];
                ans = Math.min(ans,cost);
            }

            i = j + 1;
        }

        return ans;
    }
}