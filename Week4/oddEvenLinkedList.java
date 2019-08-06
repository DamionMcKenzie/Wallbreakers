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
    public ListNode oddEvenList(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode odd = head;
        ListNode ptr = head.next;
        ListNode even = ptr;

        while(ptr != null && ptr.next != null){
            odd.next = ptr.next;
            odd = odd.next;
            ptr.next = odd.next;
            ptr.next = odd.next;
            ptr = ptr.next;
        }
        odd.next = even;
        return head;
    }


}
