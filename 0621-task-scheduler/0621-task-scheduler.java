class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];

        for(char ch : tasks) {
            freq[ch - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int f : freq) {
            if(f > 0) {
                pq.add(f);
            }
        }

        int time = 0;
        while(!pq.isEmpty()){
            int cycle = n + 1;
            List<Integer> temp = new ArrayList<>();

            int taskCount = 0;
            while(cycle > 0 && !pq.isEmpty()) {
                int remaining = pq.remove();

                if(remaining > 1) {
                    temp.add(remaining - 1);
                }

                taskCount++;
                cycle--;
            }

            for(int remaining : temp) {
                pq.add(remaining);
            }

            time += pq.isEmpty() ? taskCount : n + 1;
        }
        return time;
    }
}