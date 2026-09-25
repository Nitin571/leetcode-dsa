class Solution {

    public long subArrayRanges(int[] nums) {

        return sumMax(nums) - sumMin(nums);
    }

    private long sumMin(int[] nums) {

        int n = nums.length;
        long sum = 0;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {

            while (!st.isEmpty() &&
                  (i == n || nums[st.peek()] >= nums[i])) {

                int index = st.pop();

                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                sum += (long) nums[index]
                     * (index - left)
                     * (right - index);
            }

            if (i < n) {
                st.push(i);
            }
        }

        return sum;
    }

    private long sumMax(int[] nums) {

        int n = nums.length;
        long sum = 0;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {

            while (!st.isEmpty() &&
                  (i == n || nums[st.peek()] <= nums[i])) {

                int index = st.pop();

                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                sum += (long) nums[index]
                     * (index - left)
                     * (right - index);
            }

            if (i < n) {
                st.push(i);
            }
        }

        return sum;
    }
}