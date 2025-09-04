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
    public ListNode middle(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode previous = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(curr!=null){
            curr.next = previous;
            previous = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
        }
        return previous;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode head_1 = head;
        ListNode head_2 = reverse(middle(head));
        while(head_1 != null && head_2 != null){
            ListNode temp = head_1.next;
            head_1.next = head_2;
            head_1 = temp;
            temp = head_2.next;
            head_2.next = head_1;
            head_2 = temp;
        }
        if(head_1 != null){
            head_1.next = null;
        }
    }
}
