/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[] = new int[2];
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        int firstC = -1;
        int previousC = -1;
        int minDistance = Integer.MAX_VALUE;

        while(curr.next != null){
            ListNode next = curr.next;
            if ((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)) {
                if (firstC == -1) {
                    firstC = index;
                } else {
                    int dist = index - previousC;
                    minDistance = Math.min(minDistance,dist);
                }
                previousC = index;
            }

            prev = curr;
            curr = curr.next;
            index++;

        }
        if (minDistance == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }
        int maxDistance = previousC - firstC;
        ans[0] = minDistance;
        ans[1] = maxDistance;
        return ans;
    }
}