class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int points = 0;
        int left = 0;
        int n = cardPoints.length;
        for(int i=0;i<n;i++){
            points += cardPoints[i];
        }
        int windowSize = n-k;
        int windowSum = 0;
        for(int i=0;i<windowSize;i++){
            windowSum += cardPoints[i];
        }

        int ans = points - windowSum;
        for(int right = windowSize;right<n;right++){
            windowSum += cardPoints[right];
            windowSum -= cardPoints[left];
            left++;
            ans = Math.max(ans,points-windowSum);
        }
        return ans;
    }
}