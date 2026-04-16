class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            ArrayList<Integer> al = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    al.add(1);
                }
                else{
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    al.add(val);
                }
            }
            ans.add(al);
        }
        return ans;
    }
}