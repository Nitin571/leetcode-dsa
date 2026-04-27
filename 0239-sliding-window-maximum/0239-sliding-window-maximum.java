class Solution {
    static class Pairs implements Comparable<Pairs>{
        int val;
        int idx;
        public Pairs(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pairs p){
            return p.val-this.val;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[] = new int[nums.length-k+1];

        PriorityQueue<Pairs> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(new Pairs(nums[i],i));
        }
        res[0] = pq.peek().val;

        for(int i=k;i<nums.length;i++){
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }

            pq.add(new Pairs(nums[i],i));

            res[i-k+1] = pq.peek().val;
        }
        return res;
    }
}