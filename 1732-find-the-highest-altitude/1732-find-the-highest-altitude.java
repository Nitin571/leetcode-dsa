class Solution {
    public int largestAltitude(int[] gain) {
        int prefixsum[] = new int[gain.length+1];

        prefixsum[0] = 0;
        for(int i=1;i<= gain.length;i++){
            prefixsum[i] = prefixsum[i-1] + gain[i-1];
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<prefixsum.length;i++){
            if(prefixsum[i] > max){
                max = prefixsum[i];
            }
        }
        return max;
    }
}