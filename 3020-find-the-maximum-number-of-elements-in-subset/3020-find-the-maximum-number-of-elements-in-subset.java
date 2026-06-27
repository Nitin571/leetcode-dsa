class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long,Integer> hs = new HashMap<>();
        for(int x : nums){
            hs.put((long)x, hs.getOrDefault((long)x,0)+1);
        }
        int ans = 1;

        if (hs.containsKey(1L)) {
            int cnt = hs.get(1L);
            if (cnt % 2 == 0)
                cnt--;
            ans = Math.max(ans, cnt);
        }

        for(long x : hs.keySet()){
            if (x == 1){
                continue;
            }

            long curr = x;
            int len = 0;

            while(true){
                if(!hs.containsKey(curr))
                    break;

                int count = hs.get(curr);
                if(count >= 2){
                    len += 2;
                    curr = curr * curr;
                }
                else{
                    len++;
                    break;
                }
            }
            if(!hs.containsKey(curr))
                len--;

            ans = Math.max(ans,len);
        }

        return ans;
    }
}