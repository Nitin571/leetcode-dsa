class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        HashMap<Character, Boolean> map = new HashMap<>();
        HashMap<Character, Integer> last = new HashMap<>();

        for(int i=0;i<n;i++){
            last.put(s.charAt(i),i);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                continue;
            }

            while(!st.isEmpty() && st.peek() > ch && last.get(st.peek()) > i){
                map.remove(st.pop());
            }

            st.push(ch);
            map.put(ch,true);
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}