
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ')') {
                st.push(ch);
            } else {
                StringBuilder sb = new StringBuilder();
                while (st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
                for (int j = 0; j < sb.length(); j++) {
                    st.push(sb.charAt(j));
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char ch : st) {
            ans.append(ch);
        }
        return ans.toString();
    }
}