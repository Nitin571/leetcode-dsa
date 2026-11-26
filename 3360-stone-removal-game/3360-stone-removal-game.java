class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }
        for(int i=10;i>=1;i--){
            if(i % 2 == 0 && n < i){
                return false;
            }else if(i % 2 != 0 && n < i){
                return true;
            }
            n = n-i;
        }
        return true;
    }
}