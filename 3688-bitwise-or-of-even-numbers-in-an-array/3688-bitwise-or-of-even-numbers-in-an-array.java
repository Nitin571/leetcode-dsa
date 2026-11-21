class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int bitWiseOr = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                bitWiseOr |= nums[i];
            }
        }
        return bitWiseOr;
    }
}