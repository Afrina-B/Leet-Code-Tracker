// Last updated: 7/17/2026, 11:58:13 PM
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null)
            return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for (int i = 1; i < left; i++)
            prev = prev.next;

        ListNode curr = prev.next;

        for (int i = 0; i < right - left; i++) {

            ListNode next = curr.next;

            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}