class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int sum = 0;
        int m = a.length()-1;
        int n = b.length()-1;

        while(m >= 0 || n >= 0){
            sum = carry;

            if(m >= 0){
                sum += a.charAt(m)-'0';
                m--;
            }
            if(n >= 0){
                sum += b.charAt(n)-'0';
                n--;
            }

            sb.append((sum % 2 == 0) ? '0' : '1');
            carry = (sum > 1) ? 1 : 0;      // or we can write sum/2
        }

        if(carry > 0){
            sb.append(carry);
        }

        return sb.reverse().toString();
        
    }
}