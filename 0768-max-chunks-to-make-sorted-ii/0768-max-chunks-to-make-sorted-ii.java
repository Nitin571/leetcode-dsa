class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int count = 0;
        int[] Maxprefix = new int[n];
        int[] Minsuffix = new int[n];

        Maxprefix[0] = arr[0];
        for(int i=1;i<n;i++){
            Maxprefix[i] = Math.max(Maxprefix[i-1],arr[i]);
        }

        Minsuffix[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            Minsuffix[i] = Math.min(Minsuffix[i+1],arr[i]);
        }

        for(int i=0;i<n-1;i++){
            if(Maxprefix[i] <= Minsuffix[i+1]){
                count++;
            }
        }
        return count+1;
    }
}