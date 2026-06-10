class Solution {
    List<String> ans = new ArrayList<>();
    public void helper(int index,int n,int k,int cost,String curr,boolean preOne){
        if(cost > k){
            return;
        }
        if(index == n){
            ans.add(curr);
            return;
        }
        helper(index + 1, n, k,cost,curr + "0",false);

        if(!preOne){
            helper(index + 1, n, k,cost + index,curr + "1",true);
        }

    }
    public List<String> generateValidStrings(int n, int k) {
        helper(0,n,k,0,"",false);
        return ans;
    }
}