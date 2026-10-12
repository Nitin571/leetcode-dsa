class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(k,n,1,new ArrayList<>(),ans);
        return ans;
    }

    void backtrack(int k,int n,int index,List<Integer> list,List<List<Integer>> ans){
        if(n == 0 && list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=index;i<=9;i++){
            if(i>n) {
                break;
            }
            list.add(i);

            backtrack(k,n-i,i+1,list,ans);

            list.remove(list.size()-1);

        }

    }
}