class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        for (int start = 0; start < n; start++) {
            int product = 1;
            for (int end = start; end < n; end++) {
                product *= nums[end];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
}