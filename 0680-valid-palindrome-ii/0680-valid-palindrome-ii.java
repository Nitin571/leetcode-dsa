class Solution {

    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while(i < j){

            if(s.charAt(i) != s.charAt(j)){

                String left = s.substring(0,i) + s.substring(i+1);

                String right = s.substring(0,j) + s.substring(j+1);

                return isPalindrome(left) || isPalindrome(right);
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean isPalindrome(String s){

        int i = 0;
        int j = s.length() - 1;

        while(i < j){

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}