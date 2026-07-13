class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
        for (int i = 1; i <= 9; i++) {
            generate(i, low, high);
        }
        Collections.sort(ans);
        return ans;
    }
    void generate(int num, int low, int high) {
        if (num >= low && num <= high) {
            ans.add(num);
        }
        int lastDigit = num % 10;
        if (lastDigit == 9){
            return;
        }
        int next = num * 10 + (lastDigit + 1);
        generate(next, low, high);
    }
}