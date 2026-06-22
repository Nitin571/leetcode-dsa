class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[] = new int[26];
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            freq[ch-'a']++;
        }
        int b = freq['b'-'a'] / 1;
        int a = freq['a'-'a'] / 1;
        int l = freq['l'-'a'] / 2;
        int o = freq['o'-'a'] / 2;
        int n = freq['n'-'a'] / 1;

        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}