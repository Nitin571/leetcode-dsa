class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int a = 0;

        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            if (a < arr.length && arr[a] == i) {
                a++;
            } 
            else {
                count++;

                if (count == k) {
                    return i;
                }
            }
        }

        return arr[arr.length - 1] + (k - count);
    }
}