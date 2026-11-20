class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");

        while(sb.length() < k){
            int n = sb.length();

            for(int i=0;i<n;i++){
                char ch = sb.charAt(i);

                sb.append((char)(ch + 1));
            }
        }
        return sb.charAt(k-1);
    }
}