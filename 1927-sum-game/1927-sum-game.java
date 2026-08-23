class Solution {
    public boolean sumGame(String num) {
        int leftsum = 0;
        int rightsum = 0;
        int leftmark = 0;
        int rightmark = 0;
        
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            if (ch == '?') {
                if (i < num.length() / 2)
                    leftmark++;
                else
                    rightmark++;

            } else {
                if (i < num.length() / 2)
                    leftsum += ch - '0';
                else
                    rightsum += ch - '0';
            }
        }

        if((leftmark + rightmark) % 2 == 1){
            return true;
        }
        int sumDifference = leftsum - rightsum;
        int questionDifference = (rightmark - leftmark) * 9 / 2;

        if (sumDifference == questionDifference) {
            return false;
        }

        return true;
    }
}