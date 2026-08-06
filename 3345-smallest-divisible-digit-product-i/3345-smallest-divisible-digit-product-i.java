class Solution {
    public int smallestNumber(int n, int t) {
        for (int i = n; ; i++) {
            int pdt = 1;
            int temp = i;

            while (temp > 0) {
                pdt *= temp % 10;
                temp /= 10;
            }
            if (pdt % t == 0) {
                return i;
            }
        }
    }
}