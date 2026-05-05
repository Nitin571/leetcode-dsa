class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincapacity = 0;
        int maxcapacity = 0;

        for(int weight : weights){
            mincapacity = Math.max(mincapacity,weight);
            maxcapacity += weight;
        }

        while(mincapacity < maxcapacity){
            int mid = mincapacity + (maxcapacity - mincapacity)/2;

            int Days = 1;
            int sum = 0;
            for(int weight : weights){
                if(sum + weight > mid){
                    Days++;
                    sum = 0;
                }
                sum += weight;
            }

            if(Days > days){
                mincapacity = mid+1;
            }else{
                maxcapacity = mid;
            }
        }
        return mincapacity;
    }
}