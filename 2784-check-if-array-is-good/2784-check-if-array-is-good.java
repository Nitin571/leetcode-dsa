class Solution {
    public boolean isGood(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(num, max);
        }

        if (nums.length != max + 1) {
            return false;
        }

        for (int i = 1; i < max; i++) {
            if (map.getOrDefault(i, 0) != 1) {
                return false;
            }
        }

        if (map.get(max) != 2) {
            return false;
        }

        return true;
    }
}