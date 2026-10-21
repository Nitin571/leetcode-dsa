class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder res=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                res.append(ch);
            }
            else if(ch==')'){
                if(count>0){
                    count--;
                    res.append(ch);
                }
            }
            else res.append(ch);
        }
        for(int i=res.length()-1;i>=0;i--){
            if(res.charAt(i)=='(' && count>0){
                res.deleteCharAt(i);
                count--;
            }
        }
        
        return res.toString();
    }
}