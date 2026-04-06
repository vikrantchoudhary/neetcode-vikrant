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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        int count = n;
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        ListNode fast = head;
        while (fast != null && count > 0) {
            count--;
            fast = fast.next;
        }
        //ListNode second = fast;
        if (count > 0) return null;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
