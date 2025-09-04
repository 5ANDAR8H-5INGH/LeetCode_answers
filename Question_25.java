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
    public int count(ListNode node){
        int count = 0;
        while(node != null){
            node = node.next;
            count+=1;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        int totalNodes = count(head);
        while(totalNodes>=k){
            ListNode new_end = curr;
            ListNode last = prev;
            ListNode next = curr.next;
            for(int j = 0 ; curr != null && j<k; j++){
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
            prev = new_end;
            totalNodes -= k;
        }
        return head;
    }
}
