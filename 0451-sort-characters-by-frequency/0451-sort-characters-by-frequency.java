class Solution {
    public String frequencySort(String s) {
        char c[] = s.toCharArray();
        int freq[] = new int[128];
        for(int i=0;i<c.length;i++){
            freq[c[i]]++;
        }

        int max = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<freq.length;i++){
            if(freq[i] > max){
                max = freq[i];
            }
        }
        while(max > 0){
            for(int i=0;i<freq.length;i++){
                if(freq[i] == max){
                    for(int j = 0; j < max; j++){
                    sb.append((char)i);
                    }
                } 
            }
            max--;  
        }
        return sb.toString();
    }
}