class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2,int k1, int k2) {
        long k = (long) k1 + k2;
        int[] freq = new int[100001];
        int n = nums1.length;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
        }
        for (int d = 100000; d > 0 && k > 0; d--) {
            int count = freq[d];
            int use = (int)Math.min(k, count);

            freq[d] -= use;
            freq[d - 1] += use;

            k -= use;
        }
        long ans = 0;

        for (int d = 1; d <= 100000; d++) {
            ans += (long) freq[d] * d * d;
        }
        return ans;
    }
}