class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int num = k;

        for(int a : nums){
            set.add(a);
        }

        while(true){
            if(num % k == 0){
                if(!set.contains(num)){
                    return num;
                }else{
                    num += k;
                }
            }
        }
    }
}