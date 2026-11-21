class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 0) {
                if (nums[i] == 0)
                    nums[i] = 1;
                else
                    nums[i] = 0;


                if (nums[i + 1] == 0)
                    nums[i + 1] = 1;
                else
                    nums[i + 1] = 0;

                if (nums[i + 2] == 0)
                    nums[i + 2] = 1;
                else
                    nums[i + 2] = 0;

                count++;
            }
        }
        for (int num : nums) {
            if (num == 0)
                return -1;
        }

        return count;
    }
}