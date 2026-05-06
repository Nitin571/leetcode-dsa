class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        Iterator<Integer> it = set.iterator();
        int max = 0;
        while(it.hasNext()){
            int num = it.next();

            if(!set.contains(num - 1)){
                int start = num;
                int count = 1;

                while(set.contains(start + 1)){
                    start++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }
        return max;
    }
}