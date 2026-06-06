class Solution {
    public int totalWaviness(int num1, int num2) {
        int total = 0;
        for(int i = num1;i<= num2;i++){
            String s = String.valueOf(i);
            if(s.length() <= 2){
                continue;
            }else{
                for(int j = 1; j < s.length() - 1; j++){
                    int left = s.charAt(j - 1) - '0';
                    int mid  = s.charAt(j) - '0';
                    int right = s.charAt(j + 1) - '0';

                    if((left < mid && mid > right) || (left > mid && mid < right)){
                        total++;
                    }
                }
            }
        }
        return total;
    }
}