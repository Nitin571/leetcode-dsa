class Solution {
    public int minOperations(int[] nums, int x) {
        int left = 0;
        int totalsum = 0;
        for(int n : nums){
            totalsum += n;
        }
        int target = totalsum-x;
        if(target < 0){
            return -1;
        }

        int windowsum = 0;
        int count = -1;
        for(int right = 0;right<nums.length;right++){
            windowsum += nums[right];
            while (windowsum > target) {
                windowsum -= nums[left];
                left++;
            }

            if(windowsum == target){
                count = Math.max(count,right-left+1);
            }
        }
        if(count == -1){
            return -1;
        }

        return nums.length-count;
    }
}