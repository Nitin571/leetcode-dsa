class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int[] f=new int[n];
        for(int i:nums){
            if(i>n-1) return false;
            f[i]++;
        }
        for(int i=1;i<n-1;i++){
            if(f[i]!=1) return false;
        }
        return f[n-1]==2;
    }
}