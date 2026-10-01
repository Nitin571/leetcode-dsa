class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }
            if(ch == st.peek()){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}