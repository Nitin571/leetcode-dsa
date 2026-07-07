class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n).replace("0", "");

        if (s.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (char ch : s.toCharArray()) {
            sum += ch - '0';
        }

        return Long.parseLong(s) * sum;
    }
}