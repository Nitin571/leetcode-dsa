class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
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