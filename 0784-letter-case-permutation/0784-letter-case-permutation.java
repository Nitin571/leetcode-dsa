class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        solve(s.toCharArray(), 0, ans);
        return ans;
    }

    public void solve(char[] arr, int index, List<String> ans){
        if(index == arr.length){
            ans.add(new String(arr));
            return;
        }

        if(Character.isDigit(arr[index])) {
            solve(arr, index + 1, ans);
        }
        else{
            char ch = arr[index];

            arr[index] = Character.toLowerCase(ch);
            solve(arr, index + 1, ans);

            arr[index] = Character.toUpperCase(ch);
            solve(arr, index + 1, ans);

            arr[index] = ch;
        }
    }
}