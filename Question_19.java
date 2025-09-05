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
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
        }
        head = prev;
        return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode ptr = reverse(head);
        if (n == 1) { 
            ptr = ptr.next;  // remove first node
        } else {
            ListNode curr = ptr;
            for (int i = 1; i < n - 1 && curr != null; i++) {
                curr = curr.next;
            }
            if (curr != null && curr.next != null) {
                curr.next = curr.next.next;
            }
        }
        return reverse(ptr);
    }
}
