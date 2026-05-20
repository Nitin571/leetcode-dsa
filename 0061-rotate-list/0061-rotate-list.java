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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        int length = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }

        k = k % length;
        if(k == 0){
            return head;
        }

        int steps = length - k - 1;
        ListNode newtail = head;
        for(int i=0;i<steps;i++){
            newtail = newtail.next;
        }
        ListNode newhead = newtail.next;
        newtail.next = null;

        temp.next = head;
        return newhead;

    }
}