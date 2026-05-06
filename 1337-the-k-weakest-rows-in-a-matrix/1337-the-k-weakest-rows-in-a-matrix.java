class Solution {
    static class Row implements Comparable<Row>{
        int soldierscount;
        int idx;

        public Row(int soldierscount,int idx){
            this.soldierscount = soldierscount;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldierscount == r2.soldierscount){
                return this.idx - r2.idx;
            }else{
                return this.soldierscount - r2.soldierscount;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();
        
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    count += 1;
                }else{
                    count += 0;
                }
            }
            pq.add(new Row(count,i));
        }
        int result[] = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pq.remove().idx;
        }
        return result;
    }
}