class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int count = 0;
        int minlen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0;right < s.length();right++){
            if (s.charAt(right) == '1') {
                count++;
            }

            while (count == k) {
                int len = right - left + 1;
                if (len < minlen || len == minlen && s.substring(left, right + 1).compareTo(s.substring(start, start + minlen)) < 0) {
                    minlen = len;
                    start = left;
                }

                if (s.charAt(left) == '1') {
                    count--;
                }

                left++;
            }
        }

        if (minlen == Integer.MAX_VALUE) {
            return "";
        }

        String ans = s.substring(start, start + minlen);
        return ans;
    }
}