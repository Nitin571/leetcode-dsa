class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        String str = Arrays.toString(nums);

        for(int n : nums){
            String s = String.valueOf(n);
            int sum = 0;
            for(int i=0;i<s.length();i++){
                sum += s.charAt(i)-'0';
            }
            if(sum < min){
                min = sum;
            }
        }

        return min;
    }
}