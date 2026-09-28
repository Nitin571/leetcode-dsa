class Solution {
    public int maxDepth(String s) {
        int max = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                st.pop();
            }
            max = Math.max(st.size(),max);
        }
        return max;
    }
}