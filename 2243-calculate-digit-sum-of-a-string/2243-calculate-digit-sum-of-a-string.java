
class Solution {
    public String digitSum(String s, int k) {
        int n = s.length();
        if (n <= k) {
            return s;
        }
        while (n > k) {
            StringBuilder sb = new StringBuilder();
            int a = 0;
            while (a < n) {
                int sum = 0;

                for (int i = a; i < Math.min(a + k, n); i++) {
                    sum += s.charAt(i) - '0';
                }

                sb.append(sum);
                a += k;
            }

            s = sb.toString();
            n = s.length();
        }

        return s;
    }
}
