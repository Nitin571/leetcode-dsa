class Solution {
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public long lcm(long a, long b) {
        return (a / gcd((int)a, (int)b)) * b;
    }

    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int start = 0; start < n; start++) {

            long prod = 1;
            long lcm = 1;
            int gcd = 0;

            for(int end = start; end < n; end++) {

                prod *= nums[end];
                gcd = gcd(gcd, nums[end]);
                lcm = lcm(lcm, nums[end]);

                if(prod == lcm * gcd) {
                    ans = Math.max(ans, end - start + 1);
                }
            }
        }
        return ans;
    }
}