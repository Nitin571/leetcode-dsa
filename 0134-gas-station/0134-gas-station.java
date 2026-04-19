class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int fuel = 0;
        int total = 0;
        int startidx = 0;
        for(int i=0;i<gas.length;i++){
            int gain = gas[i]-cost[i];

            fuel += gain;
            total += gain;

            if(fuel < 0){
                startidx = i+1;
                fuel = 0;
            }
        }
        if(total >= 0){
            return startidx;
        }
        return -1;
    }
}