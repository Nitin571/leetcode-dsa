
class Solution {
    public char kthCharacter(int k) {
        if (k == 1) {
            return 'a';
        }

        int mid = 1;
        while (mid * 2 < k) {
            mid *= 2;
        }
        return (char)(kthCharacter(k - mid) + 1);
    }
}
