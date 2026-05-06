class Solution {
    public int longestConsecutive(int[] nums) {
        Iterator<Integer> it = set.iterator();

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
    }
}