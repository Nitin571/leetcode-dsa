class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int f0 = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            f0 += i * nums[i];
        }

        int f = f0;
        int max = f0;
        for(int i=1;i<nums.length;i++){
            f = f + sum - n * nums[n-i];
            max = Math.max(max,f);
        }
        return max;
    }
}