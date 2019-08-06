package Week4;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode reverse = reversed(head);
        return reverse;

    }

    ListNode reversed(ListNode node){

        ListNode head = null;

        while(node != null){
            ListNode n = new ListNode(node.val);
            n.next = head;
            head = n;

            node = node.next;
        }
        return head;
    }
}
