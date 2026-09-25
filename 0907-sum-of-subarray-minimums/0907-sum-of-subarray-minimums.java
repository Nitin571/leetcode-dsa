class Solution {
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        int n = arr.length;
        int[] prevSm = prevSmaller(arr);
        int[] nextSm = nextSmaller(arr);
        int num =(int) Math.pow(10,9)+7;
        for(int i=0;i<n;i++){
            sum += (long) (arr[i]) * (i-prevSm[i])  * (nextSm[i] - i);
        }

        sum = sum % num;
        return (int) sum;
    }
    public int[] prevSmaller(int[] arr){
        int n = arr.length;
        int r1[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            r1[i] = st.isEmpty() ? -1:st.peek();
            st.push(i);
        }
        return r1;
    }
    public int[] nextSmaller(int[] arr){
        int n = arr.length;
        int r2[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            r2[i] = st.isEmpty() ? n:st.peek();
            st.push(i);
        }
        return r2;
    }
}