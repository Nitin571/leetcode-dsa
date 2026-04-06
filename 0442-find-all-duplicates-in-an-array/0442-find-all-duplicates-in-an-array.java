class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        boolean[] seen = new boolean[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            int num = nums[i]; 

            if(seen[num]) {
                al.add(num);
            } else {
                seen[num] = true;
            }
        }

        return al;
    }
}