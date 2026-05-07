class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int length = 0;
        map.put(0,-1);
        for(int j=0;j<nums.length;j++){
            if(nums[j] == 1){
                sum += 1;
            } else{
                sum -= 1;
            }

            if(map.containsKey(sum)){
                length = Math.max(length,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        return length;
    }
}