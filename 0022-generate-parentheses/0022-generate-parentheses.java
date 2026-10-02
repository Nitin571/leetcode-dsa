class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> al = new ArrayList<>();
        helper("",0,0,n,al);
        return al;
    }

    public void helper(String s,int open,int close,int n,ArrayList<String> al){
        if(s.length() == 2*n){
            al.add(s);
            return;
        }
        if (open < n) {
            helper(s + "(", open + 1, close, n, al);
        }

        if (close < open) {
            helper(s + ")", open, close + 1, n, al);
        }
    }
}