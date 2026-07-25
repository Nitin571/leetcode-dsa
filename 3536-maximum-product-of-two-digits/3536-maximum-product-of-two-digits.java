class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int size = s.length();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);

        return arr[size-2] * arr[size-1];
    }
}