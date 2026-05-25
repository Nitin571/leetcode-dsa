class Solution {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        int closest = 0;
        for(int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - sum);
                if(diff < minDiff){
                    minDiff = diff;
                    closest = sum;
                }

                if(sum == target) {
                    return sum;
                }
                else if(sum > target) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }

        return closest;
    }
}