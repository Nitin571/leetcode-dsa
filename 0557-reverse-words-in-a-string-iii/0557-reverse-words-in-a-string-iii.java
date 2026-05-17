class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            int start = i;
            while(i < s.length() && s.charAt(i) != ' '){
                i++;
            }

            for(int j=i-1;j>=start;j--){
                sb.append(s.charAt(j));
            }
            if(i < s.length()){
                sb.append(" ");
            }
            i++;
        }
        return sb.toString();
    }
}