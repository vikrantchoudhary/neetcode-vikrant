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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head);
        ListNode groupPrev = dummy;
        while(true) {
            ListNode kthNode = getKthNode(groupPrev,k);
            if (kthNode == null) break;
            ListNode groupNext = kthNode.next;
            ListNode prev = kthNode.next;
            ListNode cur = groupPrev.next;
            while (cur != groupNext) {
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            ListNode temp = groupPrev.next;
            groupPrev.next = kthNode;
            groupPrev = temp;
        }
        return dummy.next;
    }
    public ListNode getKthNode(ListNode cur, int k) {
        int count = 0;
        while (cur != null && count < k) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
}
