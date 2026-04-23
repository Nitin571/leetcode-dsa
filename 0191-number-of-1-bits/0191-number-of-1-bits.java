class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        if(n == 0){
            return 0;
        }
        return (n%2) + hammingWeight(n/2);
    }
}