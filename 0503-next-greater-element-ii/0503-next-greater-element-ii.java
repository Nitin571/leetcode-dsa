class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2*nums.length - 1; i >= 0; i--) {
            int idx = i % n;
            while (!st.isEmpty() && st.peek() <= nums[idx]) {
                st.pop();
            }
            if(i < n){
                if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            }
            st.push(nums[idx]);
        }
        return result;
    }
}