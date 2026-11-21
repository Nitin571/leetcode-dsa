class Solution {
    public String maximumXor(String s, String t) {
        int tZeroes = 0;
        int tOnes = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '1') {
                tOnes++;
            } else {
                tZeroes++;
            }
        }

        for (int i = 0; i < s.length(); i++) {

            int a = s.charAt(i) - '0';
            int b;

            if (a == 1 && tZeroes > 0) {
                b = 0;
                tZeroes--;
            } 
            else if (a == 0 && tOnes > 0) {
                b = 1;
                tOnes--;
            } 
            else if (a == 1) {
                b = 1;
                tOnes--;
            } 
            else {
                b = 0;
                tZeroes--;
            }

            int result = a ^ b;

            sb.append(result);
        }

        return sb.toString();
    }
}