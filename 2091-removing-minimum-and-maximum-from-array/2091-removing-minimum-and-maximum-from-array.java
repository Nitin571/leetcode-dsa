class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int minpos=0,maxpos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
                minpos = i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                maxpos = i;
            }
        }

        int fromLeft = Math.max(minpos, maxpos) + 1;
        int fromRight = nums.length - Math.min(minpos, maxpos);
        int bothSides = Math.min(minpos, maxpos) + 1 + nums.length - Math.max(minpos, maxpos);
        
        return Math.min(fromLeft, Math.min(fromRight, bothSides));
    }
}