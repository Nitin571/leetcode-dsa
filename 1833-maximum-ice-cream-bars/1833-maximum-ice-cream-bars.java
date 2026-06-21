class Solution {
    public void countingsort(int costs[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<costs.length;i++){
            largest = Math.max(largest,costs[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<costs.length;i++){
            count[costs[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                costs[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public int maxIceCream(int[] costs, int coins) {
        countingsort(costs);
        int sum = 0;
        int count = 0;
        for(int i=0;i<costs.length;i++){
            if(sum + costs[i] > coins){
                return count;
            }
            sum += costs[i];
            count++;
        }
        return count;
    }
}