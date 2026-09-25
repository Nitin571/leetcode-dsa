class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        int[] prevSmall = new int[n];
        int[] nextSmall = new int[n];
        int[] prevLarge = new int[n];
        int[] nextLarge = new int[n];

        // previous smaller
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i] <= nums[st.peek()]){
                st.pop();
            }
            prevSmall[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // next smaller 
        st.clear();
        for (int i = n-1;i >= 0;i--) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            nextSmall[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // previous greater
        st.clear();
        for (int i=0;i<n;i++) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            prevLarge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // next greater
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }
            nextLarge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < n; i++) {
            long left = i - prevSmall[i];
            long right = nextSmall[i] - i;
            minSum += (long) nums[i] * left * right;
            left = i - prevLarge[i];
            right = nextLarge[i] - i;
            maxSum += (long) nums[i] * left * right;
        }
        return maxSum - minSum;
    }
}