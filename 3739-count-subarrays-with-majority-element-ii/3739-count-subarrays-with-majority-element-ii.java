class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        int cumSum = 0;
        mp.put(0, 1);
        long validLeftPoints = 0;
        long result = 0;
        for (int num : nums) {
            if (num == target) {
                validLeftPoints += mp.getOrDefault(cumSum, 0);
                cumSum++;
            } else {
                cumSum--;
                validLeftPoints -= mp.getOrDefault(cumSum, 0);
            }
            mp.put(cumSum, mp.getOrDefault(cumSum, 0) + 1);
            result += validLeftPoints;
        }

        return result;
    }
}