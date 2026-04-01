class Solution {
    public int maxCoins(int[] piles) {
        int maxcoins = 0;
        Arrays.sort(piles);
        int i = 0,j = piles.length-1;

        while(i < j){
            j--;
            maxcoins += piles[j];
            j--;
            i++;
        }
        return maxcoins;
        
    }
}