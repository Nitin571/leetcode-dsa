class Solution {
    public int countValidPrefixes(String s) {
        int diff = 0;
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '1') {
                diff += 1;
            } else {
                diff -= 1;
            }
            
            if (Math.abs(diff) <= 1) {
                result += 1;
            }
        }
        
        return result;
    }
}