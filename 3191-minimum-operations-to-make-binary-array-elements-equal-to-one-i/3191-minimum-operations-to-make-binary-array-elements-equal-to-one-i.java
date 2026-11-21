class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int left = 0;
        int right = 2;

        while (right < nums.length) {
            if (nums[left] == 0) {

                if (nums[left] == 0)
                    nums[left] = 1;
                else
                    nums[left] = 0;

                if (nums[left + 1] == 0)
                    nums[left + 1] = 1;
                else
                    nums[left + 1] = 0;

                if (nums[right] == 0)
                    nums[right] = 1;
                else
                    nums[right] = 0;

                count++;
            }

            left++;
            right++;
        }

        for (int num : nums) {
            if (num == 0)
                return -1;
        }

        return count;
    }
}