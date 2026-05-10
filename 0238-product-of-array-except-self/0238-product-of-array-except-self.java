class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixsum[] = new int[nums.length];
        int suffixsum[] = new int[nums.length];
        
        prefixsum[0] = 1;
        for(int i=1;i<nums.length;i++){
            prefixsum[i] = prefixsum[i-1] * nums[i-1];
        }

        suffixsum[nums.length-1] = 1;

        for(int i=nums.length-2;i>=0;i--){
            suffixsum[i] = suffixsum[i+1] * nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = prefixsum[i] * suffixsum[i];
        }

        return nums;
    }
}