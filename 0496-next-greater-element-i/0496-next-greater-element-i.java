class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nxtgreater[] = new int[nums2.length];
        int result[] = new int[nums1.length];

        Stack<Integer> s = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && nums2[s.peek()] <= nums2[i]){
                s.pop();
            } 
            if(s.isEmpty()){
                nxtgreater[i] = -1;
            } else{
                nxtgreater[i] = nums2[s.peek()];
            }
            s.push(i);
        }

        for(int i=0;i<nums1.length;i++){
            int idx = 0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    idx = j;
                    break;
                }
            }
            result[i] = nxtgreater[idx];
        }
        return result;
    }
    
}