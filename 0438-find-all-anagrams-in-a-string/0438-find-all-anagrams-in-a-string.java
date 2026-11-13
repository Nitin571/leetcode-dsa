class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] freqP = new int[26];
        int[] freqS = new int[26];

        int n = s.length();
        int m = p.length();

        if (m > n) {
            return ans;
        }

        for (int i = 0; i < m; i++) {
            char ch1 = p.charAt(i);
            freqP[ch1-'a']++;
        }

        for(int i=0;i<m;i++){
            char ch2 = s.charAt(i);
            freqS[ch2-'a']++; 
        }

        if(Arrays.equals(freqS,freqP)){
            ans.add(0);
        }

        int counter = 0;
        for (int i = m; i < n; i++) {
            freqS[s.charAt(counter)-'a']--;

            char ch = s.charAt(i);
            freqS[ch-'a']++;

            if(Arrays.equals(freqP,freqS)){
                ans.add(i-m+1);
            }
            counter++;
        }

        return ans;

    }
}