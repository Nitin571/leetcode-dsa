class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxOne = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 1) {
                count++;
                maxOne = Math.max(maxOne, count);
            } else {
                count = 0;
            }
        }
        return maxOne;
    }
}