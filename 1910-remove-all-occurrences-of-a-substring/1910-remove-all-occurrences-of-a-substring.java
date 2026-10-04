class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        int n = part.length();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
            if(st.size() >= n){
                boolean found = true;
                for(int j=0;j<n;j++){
                    if (st.get(st.size() - n + j) != part.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if(found){
                    for(int k=0;k<n;k++){
                        st.pop();
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}