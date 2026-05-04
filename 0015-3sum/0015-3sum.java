class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && (nums[i] == nums[i-1])){
                continue;
            }
            int low =  i+1;
            int high = nums.length-1;
            int target = -nums[i];

            while(low < high){
                if(nums[low] + nums[high] == target){
                    List<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[low]);
                    al.add(nums[high]);
                    result.add(al);
                    low++;
                    high--;

                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                }
                else if(nums[low] + nums[high] < target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;

    }
}