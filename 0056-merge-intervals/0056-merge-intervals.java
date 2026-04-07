class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> al = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 0; i < intervals.length - 1; i++){
            if(end >= intervals[i+1][0]){
                end = Math.max(end, intervals[i+1][1]);
            } else {
                al.add(new int[]{start, end});
                start = intervals[i+1][0];
                end = intervals[i+1][1];
            }
        }

        al.add(new int[]{start, end});

        int[][] ans = new int[al.size()][2];
        for(int i = 0; i < al.size(); i++){
            ans[i] = al.get(i);
        }

        return ans;
    }
}