class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        while(n>0){
            int lst = n % 10;
            sum += lst;
            n = n/10;
        }
        return sum;
    }
}