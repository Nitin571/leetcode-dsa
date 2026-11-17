
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        boolean[] seen = new boolean[1000];
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    if (i == j || j == k || i == k) {
                        continue;
                    }

                    if (digits[i] == 0 || digits[k] % 2 != 0) {
                        continue;
                    }

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if (!seen[num]) {
                        al.add(num);
                        seen[num] = true;
                    }
                }
            }
        }

        Collections.sort(al);

        int[] ans = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }

        return ans;
    }
}
