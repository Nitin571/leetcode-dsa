class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            while(asteroids[i]<0 && !st.isEmpty() && st.peek()>0){
                if(st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }else if (st.peek() == Math.abs(asteroids[i])) {
                    st.pop();
                    asteroids[i] = 0;
                    break;
                }else{
                    asteroids[i] = 0;
                    break;
                }
            }
            if(asteroids[i] != 0){
                st.push(asteroids[i]);
            }
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1;i >= 0;i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}