class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k > 0) {
            st.pop();
            k--;
        }

        if(st.isEmpty()){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<st.size();i++){
            sb.append(st.get(i));
        }

        int i=0;
        while(i < sb.length()-1  && sb.charAt(i) == '0'){
            i++;
        }

        return sb.substring(i);
    }
}