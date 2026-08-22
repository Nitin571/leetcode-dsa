class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int pdt = 1;
        while(n>0){
            sum += n%10;
            pdt *= n%10;
            n /= 10;
        }

        if(num % (sum + pdt) == 0){
            return true;
        }
        return false;
    }
}