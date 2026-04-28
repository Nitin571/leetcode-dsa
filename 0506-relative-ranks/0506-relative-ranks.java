class Solution {
    public String[] findRelativeRanks(int[] score) {
        String result[] = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.add(score[i]);
        }

        int rank = 1;
        while(!pq.isEmpty()){
            int curr = pq.remove();

            for(int i=0;i<score.length;i++){
                if(score[i] == curr){
                    if(rank == 1){
                        result[i] = "Gold Medal";
                    }
                    else if(rank == 2){
                        result[i] = "Silver Medal";
                    }
                    else if(rank == 3){
                        result[i] = "Bronze Medal";
                    }
                    else{
                        result[i] = String.valueOf(rank);
                    }
                    break;
                }
            }
            rank++;
        }

        return result;
    }
}