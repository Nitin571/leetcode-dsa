class Solution {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        int result[] = new int[nums.length];
        int i = result.length-1;

        while(low <= high){
            int val1 = nums[low]*nums[low];
            int val2 = nums[high]*nums[high];

            if(val1 > val2){
                result[i] = val1;
                low++;
            }else{
                result[i] = val2;
                high--;
            }

            i--;
        }

        return result;
    }
}