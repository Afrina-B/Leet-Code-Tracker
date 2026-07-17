// Last updated: 7/17/2026, 11:56:47 PM
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        ListNode e = head, o = head.next, t = head.next;

        while (e != null && e.next != null && o!=null && o.next!=null) {
            ListNode k= o.next.next;
            e.next = e.next.next;
            o.next=k;
            o=o.next;
            e = e.next;
        }
        e.next = t;
        return head;
    }
}