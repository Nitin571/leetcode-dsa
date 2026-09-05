class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int Max[] = new int[n];
        int Min[] = new int[n];

        Max[0] = nums[0];

        for(int i=1;i<n;i++){
            if(nums[i] > Max[i-1]){
                Max[i] = nums[i];
            }else{
                Max[i] = Max[i-1];
            }
        }

        Min[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i] < Min[i+1]){
                Min[i] = nums[i];
            }
            else{
                Min[i] = Min[i+1];
            }
        }

        for(int i=0;i<n;i++){
            int a = Max[i] - Min[i];
            if(a <= k){
                return i;
            }
        }
        return -1;
    }
}