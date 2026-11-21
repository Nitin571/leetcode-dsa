class Solution {
    public String maximumXor(String s, String t) {
        int tZeroes = 0;
        int tOnes = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<t.length();i++){
            if(t.charAt(i) == '1'){
                tOnes++;
            }else{
                tZeroes++;
            }
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '1'){
                if(tZeroes > 0){
                    sb.append('1');
                    tZeroes--;
                }else{
                    sb.append('0');
                    tOnes--;
                }
            }else{
                if(tOnes > 0){
                    sb.append('1');
                    tOnes--;
                }else{
                    sb.append('0');
                    tZeroes--;
                }
            }

        }
        return sb.toString();
    }
}