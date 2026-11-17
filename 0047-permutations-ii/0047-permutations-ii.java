
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }

    private void helper(int[] nums, int index,List<List<Integer>> ans) {

        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();

            for (int num : nums) {
                temp.add(num);
            }

            ans.add(temp);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {
            if (set.contains(nums[i])) continue;

            set.add(nums[i]);


            swap(nums, index, i);
            helper(nums, index + 1, ans);
            swap(nums, index, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
