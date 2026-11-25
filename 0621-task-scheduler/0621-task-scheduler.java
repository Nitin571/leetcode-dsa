class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];

        for(char ch : tasks) {
            freq[ch - 'A']++;
        }

        Arrays.sort(freq);
        int max = freq[25];
        int emptySpots = (max - 1) * n;
        for(int i = 24; i >= 0; i--) {
            emptySpots -= Math.min(max - 1, freq[i]);
        }

        return emptySpots > 0 ? tasks.length + emptySpots : tasks.length;
    }
}