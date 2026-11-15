class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int pSum[] = new int[n];

        pSum[0] = arr[0];
        for(int i=1;i<n;i++){
            pSum[i] = arr[i] + pSum[i-1];
        }

        long ans = 0;
        int oddSum = 0;
        int evenSum = 1;

        for(int i=0;i<n;i++){
            if(pSum[i] % 2 == 0){
                ans += oddSum;
                evenSum++;
            }else{
                ans += evenSum;
                oddSum++;
            }
        }
        return (int)(ans % 1000000007);

    }
}