class Solution {
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int k=i;k<=j;k++){
                    min = Math.min(nums[k],min);
                    max = Math.max(nums[k],max);
                }
                ans += max-min;
            }
        }
        return ans;
    }
}