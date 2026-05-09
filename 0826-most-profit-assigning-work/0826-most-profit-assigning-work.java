class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<worker.length;i++){
            int max=0;
            for(int j=0;j<difficulty.length;j++){
                if(worker[i] >= difficulty[j]){
                    max = Math.max(max,profit[j]);
                }
            }
            al.add(max);
        }
        int s=0;
        for(int i=0;i<al.size();i++){
            s += al.get(i);
        }
        return s;
    }
}