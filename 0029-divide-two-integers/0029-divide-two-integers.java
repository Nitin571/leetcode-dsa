class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);
        long number = Math.abs((long) dividend);
        long div = Math.abs((long) divisor);
        
        long ans = 0;
        while(number >= div){
            int count = 0;
            while(number >= (div << (count+1))){
                count++;
            }
            ans += (1<<count);
            number = number - (div << count);
        }
        if(negative){
            ans = -ans;
        }
        return (int) ans;
    }
}