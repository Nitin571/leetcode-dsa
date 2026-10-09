class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int open = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            if (s.charAt(i) == '(') {
                open++;
            }
            else{
                if(i+1 < n && s.charAt(i + 1) == ')'){
                    if(open > 0){
                        open--;
                    }else{
                        ans++;
                    }
                    i++;
                }else{
                    if(open > 0){
                        open--;
                    }else{
                        ans++;
                    }
                    ans++;
                }
            }
        }
        if(open != 0){
            ans += open * 2;
        }
        return ans;
    }
}