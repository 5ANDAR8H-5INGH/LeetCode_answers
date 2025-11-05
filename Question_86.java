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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = new ListNode(0);
        ListNode less = dummy;
        ListNode greater = dummy1;
        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                less.next = curr;
                less = curr;
                curr = curr.next;
            }
            else if(curr.val >= x){
                greater.next = curr;
                greater = curr;
                curr = curr.next;
            }
        }
        greater.next = null;
        less.next = dummy1.next;
        return dummy.next;
    }
}
