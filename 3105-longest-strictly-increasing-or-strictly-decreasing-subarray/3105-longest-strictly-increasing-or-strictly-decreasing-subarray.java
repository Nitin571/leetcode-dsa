class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1;
        int increase = 1;
        int decrease = 1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] > nums[i]){
                increase++;
                decrease = 1;
            }else if(nums[i+1] < nums[i]){
                decrease++;
                increase = 1;
            }else{
                increase = 1;
                decrease = 1;
            }

            ans = Math.max(ans,Math.max(increase,decrease));
        }
        return ans;
    }
}