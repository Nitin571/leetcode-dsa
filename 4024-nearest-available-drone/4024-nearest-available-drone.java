class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int s = Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0;i<drones.length;i++){
            int a = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);
            if(a <= drones[i][2]){
                if(a < s){
                    s = a;
                    ans = i;
                }
            }
        }
        return ans;
    }
}