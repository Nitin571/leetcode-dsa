class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[] = new int[nums.length];
        leftsum[0] = 0;
        for(int i=1;i<nums.length;i++){
            leftsum[i] = leftsum[i-1] + nums[i-1];
        }
        int rightsum[] = new int[nums.length];
        rightsum[nums.length-1] = 0;
        for(int i = nums.length-2;i>=0;i--){
            rightsum[i] = rightsum[i+1] + nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(rightsum[i] - leftsum[i]);
        }

        return nums;
    }
}