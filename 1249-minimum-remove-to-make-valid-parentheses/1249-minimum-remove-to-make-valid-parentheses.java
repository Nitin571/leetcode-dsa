class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
                st.push(c);
            } else if (c == ')') {
                if (open > 0) {   
                    open--;
                    st.push(c);
                }                
            } else {
                st.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        int close = 0;

        while (!st.isEmpty()) {
            char c = st.pop();
            if (c == ')') {
                close++;
                sb.append(c);
            } else if (c == '(') {
                if (close > 0) {
                    close--;
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.reverse().toString();
    }
}