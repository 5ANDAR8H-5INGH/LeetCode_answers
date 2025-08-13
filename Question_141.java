/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Question_141 {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> lst = new ArrayList<>();
        ListNode n1 = head;
        while(n1!=null){
            if(lst.contains(n1)){
                return true;
            }
            else{
                lst.add(n1);
                n1 = n1.next;
            }
        }
        return false;
    }
}

// In this type of questions always use fast and slow pointer method as 
//the fast pointer moves by 2 nodes and the slow pointer moves by 1 node 
// at a time they will meet which indicates the presence of cycle