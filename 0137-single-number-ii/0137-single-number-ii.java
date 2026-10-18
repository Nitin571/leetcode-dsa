class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int k=0;k< 32;k++){
            int temp = (1<<k);
            int countones = 0,countzeroes = 0;
            for(int num : nums){
                if((num & temp) == 0){
                    countzeroes++;
                }else{
                    countones++;
                }
            }

            if(countones % 3 == 1){
                result = (result | temp);
            }
        }
        return result;
    }
}