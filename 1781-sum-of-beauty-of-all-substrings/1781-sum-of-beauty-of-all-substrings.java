class Solution {
    public int beautySum(String s) {

        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] freq = new int[26];
                for (int k = i; k <= j; k++) {
                    freq[s.charAt(k) - 'a']++;
                }
                int max = 0;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }
                ans += max - min;
            }
        }

        return ans;
    }
}