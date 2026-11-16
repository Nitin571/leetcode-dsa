class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};

        StringBuilder sb = new StringBuilder();
        solve(0, digits, map, sb, ans);
        return ans;
    }

    private void solve(int idx,String digits,String map[],StringBuilder sb,List<String> ans){
        if(idx == digits.length()){
            ans.add(sb.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];

        for(int i=0;i<letters.length();i++){

            sb.append(letters.charAt(i));
            solve(idx + 1, digits, map, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}