class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int n : arr1) {
            int left = 0;
            int right = arr2.length - 1;
            int index = arr2.length;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr2[mid] >= n) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            boolean valid = true;

            if (index < arr2.length && Math.abs(arr2[index] - n) <= d) {
                valid = false;
            }

            if (index > 0 && Math.abs(arr2[index - 1] - n) <= d) {
                valid = false;
            }

            if(valid){
                count++;
            }
        }
        return count;
    }
}