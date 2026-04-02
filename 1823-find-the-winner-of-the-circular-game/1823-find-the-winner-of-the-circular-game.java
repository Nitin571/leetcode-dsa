class Solution {
    ArrayList<Integer> al = new ArrayList<>();
    public int findTheWinner(int n, int k) {
        for(int i=1;i<=n;i++){
            al.add(i);
        }

        int i = 0;
        while(al.size() > 1){
            
            i = (i+k-1) % al.size();
            al.remove(i);
        }
        return al.get(0);
    }
}