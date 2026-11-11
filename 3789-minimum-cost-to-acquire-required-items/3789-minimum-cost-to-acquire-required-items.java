class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long min = Math.min(costBoth, cost1 + cost2);
        long common = Math.min(need1, need2);

        long ans = common * min;
        ans += (long)(need1 - common) * cost1;
        ans += (long)(need2 - common) * cost2;

        long extra = (long)Math.max(need1, need2) * costBoth;
        return Math.min(extra,ans);
    }
}