class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[j]) < Math.abs(nums[i])){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i] *= nums[i];
        }
        return nums;
    }
}