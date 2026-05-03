class Solution {
    public int distance(int p[]){
        return p[0]*p[0] + p[1]*p[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []> pq = new PriorityQueue<>((a, b) -> distance(a) - distance(b));

        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
        }

        int result[][] = new int[k][2];
        for(int i = 0; i < k; i++){
            result[i] = pq.remove();
        }

        return result;
    }
}