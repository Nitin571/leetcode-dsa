class Solution {
    public String decodeAtIndex(String s, int k) {
        int n = s.length();
        long size = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                size = size * (ch - '0');
            } 
            else {
                size++;
            }
        }

        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            k = (int)(k % size);
            if(k == 0 && Character.isLetter(ch)){
                return Character.toString(ch);
            }else{
                if (Character.isDigit(ch)) {
                    size = size / (ch - '0');
                } 
                else {
                    size--;
                }
            }
        }
        return "";
    }
}