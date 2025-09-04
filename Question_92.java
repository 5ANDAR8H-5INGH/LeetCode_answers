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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        for(int i = 1 ; i<left ; i++){
            prev = curr;
            curr = curr.next;
        }
        ListNode new_end = curr;
        ListNode last = prev;
        ListNode next = curr.next;
        for(int j = 0 ; curr != null && j < right - left + 1 ; j++){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
        }
        if(last!=null){
            last.next = prev;
        }
        else{
            head = prev;
        }     
        new_end.next = curr;
        return head;   
    }
}
