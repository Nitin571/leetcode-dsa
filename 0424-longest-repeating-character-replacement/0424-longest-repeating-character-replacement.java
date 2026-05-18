class Solution {
    public int characterReplacement(String s, int k) {
       int freq[] = new int[26];
       int left = 0;
       int maxfrequency = 0;
       int result = 0;

       for(int right = 0;right<s.length();right++){
            freq[s.charAt(right) - 'A']++;
            maxfrequency = Math.max(maxfrequency,freq[s.charAt(right) - 'A']);

            
            while((right - left + 1) - maxfrequency > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result,right-left+1);
       }
       return result;
    }
}