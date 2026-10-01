class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && ch == st.peek()) {

                int count = counts.pop();
                count++;
                counts.push(count);

            } else {

                st.push(ch);
                counts.push(1);
            }

            if (counts.peek() == k) {
                st.pop();
                counts.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            char ch = st.pop();
            int count = counts.pop();

            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
}