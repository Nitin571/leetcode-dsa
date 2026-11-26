class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        helper(0,nums,al,ans);
        return ans;
    }

    private void helper(int idx, int[] nums,List<Integer> al,List<List<Integer>> ans) {

        if (al.size() >= 2) {
            ans.add(new ArrayList<>(al));
        }

        HashSet<Integer> set = new HashSet<>();    // Each recursive call gets its own HashSet to avoid duplicate choices at the same recursion level while allowing duplicate elements in a subsequence.

        for (int i = idx; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                continue;
            }
            if (al.size() == 0 || nums[i] >= al.get(al.size() - 1)) {

                set.add(nums[i]);

                al.add(nums[i]);
                helper(i + 1, nums, al, ans);
                al.remove(al.size() - 1);
            }
        }
    }
}