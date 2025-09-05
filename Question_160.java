/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 public class Question_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
}

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if (headA == null || headB == null) return null;
//         ArrayList<ListNode> lst = new ArrayList<>();
//         ListNode curr1 = headA;
//         while(curr1 != null){
//             lst.add(curr1);
//             curr1 = curr1.next;
//         }
//         ListNode curr2 = headB;
//         while(curr2 != null){
//             if(lst.contains(curr2)){
//                 return curr2;
//             }
//             else{
//                 curr2 = curr2.next;
//             }
//         }
//         return null;
//     }
// }