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
    public ListNode reverseList(ListNode head) {

        if(head == null)return head;

        ListNode curr;
        ListNode after;

        curr = head;
        after = head;
        after = after.next;

        ListNode prev = null;

        ListNode ans;

        while(curr != null){

            curr.next = prev;
            prev = curr;

            // if(after.next == null)break;
            
            curr = after;

            // curr = after;
            if(after != null)after = after.next;
        }

        return prev;
        
    }
}