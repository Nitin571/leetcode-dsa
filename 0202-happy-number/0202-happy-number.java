class Solution {
    public boolean isHappy(int n) { 
        if(n == 1){
            return true;
        }
        if(n == 4){
            return false;
        }
        int sum = 0;
        while(n>0){
            int a = n%10;
            sum += a*a;
            n = n/10;
        }
        return isHappy(sum);
    }
}