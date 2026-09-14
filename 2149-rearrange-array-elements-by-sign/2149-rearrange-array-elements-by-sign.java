class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                l1.add(nums[i]);
            }else{
                l2.add(nums[i]);
            }
        }

        int a = 0;
        int b = 0;

        for(int i=0;i<n;i++){
            if(i%2 == 0){
                nums[i] = l1.get(a);
                a++;
            }else{
                nums[i] = l2.get(b);
                b++;
            }
        }

        return nums;

    }
}