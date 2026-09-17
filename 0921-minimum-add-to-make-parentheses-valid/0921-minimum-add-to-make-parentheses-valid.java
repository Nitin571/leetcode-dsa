class Solution {
    public int minAddToMakeValid(String s) {
        int a1 = 0;
        int a2 = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                a1++;
            }else{
                if(a1>0){
                    a1--;
                }else{
                    a2++;
                }
            }
        }
        return a1+a2;
    }
}