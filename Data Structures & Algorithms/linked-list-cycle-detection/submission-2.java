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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode r1 = head;
        ListNode r2 = head.next;

        while (r1 != null && r2 != null) {
            
            if (r1 == r2) {
                return true;
            }


            r1 = r1.next;

            if (r2.next != null && r2.next.next != null ){
                r2 = r2.next.next;
            } else {
                return false;
            }
        }
        return false;

    }
}
