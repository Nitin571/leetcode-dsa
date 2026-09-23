class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int[] interval:intervals){
            int left = interval[0];
            int right = interval[1];

            if(!pq.isEmpty() && pq.peek() < left){
                pq.poll();
            }
            pq.add(right);
        }
        return pq.size();
    }
}