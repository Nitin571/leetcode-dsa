class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                int count = 0;
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += nums.get(k);
                    count++;
                }
                if(count >= l && count <= r && sum > 0){
                    ans = Math.min(sum,ans);
                }
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}