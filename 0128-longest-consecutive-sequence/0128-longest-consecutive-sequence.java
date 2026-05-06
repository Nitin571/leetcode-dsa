class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int start = num;
                int count = 1;
            
                while(set.contains(start+1)){
                    count++;
                    start++;
                }
                max = Math.max(max,count);
            }
        }

        return max;
    }
}