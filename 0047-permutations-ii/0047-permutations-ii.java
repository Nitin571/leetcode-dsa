
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        helper(map, current, ans, nums.length);
        return ans;
    }

    private void helper(HashMap<Integer, Integer> map,List<Integer> current,
    List<List<Integer>> ans,int n) {

        if (current.size() == n) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int num : map.keySet()) {

            if (map.get(num) == 0) continue;

            current.add(num);
            map.put(num, map.get(num) - 1);

            helper(map, current, ans, n);

            current.remove(current.size() - 1);
            map.put(num, map.get(num) + 1);
        }
    }
}
