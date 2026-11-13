class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int l = 1;
        int r = 0;

        for (int pile : piles) {
            r = Math.max(r, pile);
        }
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long hours = 0;

            for (int i = 0; i < piles.length; i++) {
                int hourNeeded = piles[i]/mid;
                if(piles[i] % mid != 0){
                    hourNeeded++;
                }
                hours += hourNeeded;
            }

            if(hours <= h){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}