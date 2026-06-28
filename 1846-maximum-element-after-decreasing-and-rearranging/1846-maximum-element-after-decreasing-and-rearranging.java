class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        int max = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] - arr[i-1] <= 1){
                max = arr[i];
            }else{
                arr[i] = arr[i-1]+1;
                max = arr[i];
            }
        }
        return max;
    }
}