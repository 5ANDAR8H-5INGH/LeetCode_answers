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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = head;
        ListNode first = dummy;
        while(ptr!=null){
            if(ptr.next == null || ptr.val != ptr.next.val){
                first.next = ptr;
                first = ptr;
                ptr = ptr.next;
            }
            else{
                while(ptr.next != null && ptr.val == ptr.next.val){
                    ptr = ptr.next;
                }
                ptr = ptr.next;
            }
        }
        first.next = ptr;
        return dummy.next;
    }
}
