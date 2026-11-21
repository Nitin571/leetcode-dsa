
class Solution {

    public List<Integer> grayCode(int n) {

        List<String> rres = solution(n);

        List<Integer> ans = new ArrayList<>();

        // Convert binary strings into integers
        for (String str : rres) {
            ans.add(Integer.parseInt(str, 2));
        }

        return ans;
    }

    public List<String> solution(int n) {

        // Base case
        if (n == 1) {
            List<String> bres = new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }

        // Recursive call
        List<String> rres = solution(n - 1);
        List<String> mres = new ArrayList<>();

        // First half: Add 0 in original order
        for (int i = 0; i < rres.size(); i++) {
            String rstr = rres.get(i);
            mres.add("0" + rstr);
        }

        // Second half: Add 1 in reverse order
        for (int i = rres.size() - 1; i >= 0; i--) {
            String rstr = rres.get(i);
            mres.add("1" + rstr);
        }

        return mres;
    }
}
