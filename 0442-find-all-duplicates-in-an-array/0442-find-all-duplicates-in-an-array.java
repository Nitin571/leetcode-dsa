class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        if(nums.length == 0 || nums.length == 1){
            return al;
        }
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i])-1;

            if(nums[idx] < 0){
                al.add(Math.abs(nums[i]));
            } else{
                nums[idx] = -nums[idx];
            }
        }

        return al;
    }
}