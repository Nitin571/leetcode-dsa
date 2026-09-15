class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1) % n]){
                count++;
            }
        }
        if(count == 1 || count == 0){
            return true;
        }
        return false;
    }
}