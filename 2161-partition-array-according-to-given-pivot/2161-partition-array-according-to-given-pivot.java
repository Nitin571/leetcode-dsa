class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] < pivot){
                small.add(nums[i]);
            }
            if(nums[i] > pivot){
                large.add(nums[i]);
            }
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == pivot){
                count++;
            }
        }

        int i=0;
        for(int j = 0; j < small.size(); j++) {
            nums[i++] = small.get(j);
        }
        while(count > 0) {
            nums[i++] = pivot;
            count--;
        }
        for(int j = 0; j < large.size(); j++) {
            nums[i++] = large.get(j);
        }

        return nums;

    }
}