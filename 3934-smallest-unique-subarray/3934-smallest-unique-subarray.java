class Solution {
    private long pow(long base,long exp,long mod){
        long res=1;
        while(exp!=0){
            if(exp%2==1){
                res=(res*base)%mod;
            }
            base=(base*base)%mod;
            exp>>=1;
        }
        return res;
    }
    private boolean helper(int[]nums,int mid){
        long hash=0;
        long m = 100007;
        long mod = 1_000_000_007L;
        HashMap<Long,Integer>map=new HashMap<>();
        for(int i=0;i<mid-1;i++){
            hash=(hash*m+nums[i])%mod;
        }
        long p=pow(m,mid-1,mod);
        for(int i=mid-1;i<nums.length;i++){
            hash=(hash*m+nums[i])%mod;
            map.put(hash,map.getOrDefault(hash,0)+1);
            hash=(hash-(nums[i-(mid-1)]*p)%mod+mod)%mod;
        }
        // System.out.println(map);
        for(int v:map.values()){
            if(v==1)return true;
        }
        return false;
    }
    public int smallestUniqueSubarray(int[] nums) {
        int n=nums.length;
        int low=1;
        int high=n;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(nums,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}