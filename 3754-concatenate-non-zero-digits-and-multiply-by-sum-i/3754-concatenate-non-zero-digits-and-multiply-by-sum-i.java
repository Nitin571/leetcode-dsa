class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        String result = "";
        int sum = 0;

        for (char ch : s.toCharArray()) {
            if (ch != '0') {
                result += ch;   
                sum += ch - '0';
            }
        }

        return result.isEmpty() ? 0 : Long.parseLong(result) * sum;
    }
}