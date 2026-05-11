class Solution {
    public char findTheDifference(String s, String t) {
        int ssum=0;
        int tsum=0;
        for(int i=0;i<s.length();i++){
            ssum+=s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            tsum+=t.charAt(j);
        }
        int result=tsum-ssum;
        return (char) result;
    }
}