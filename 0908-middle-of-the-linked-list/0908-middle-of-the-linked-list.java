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
    public ListNode middleNode(ListNode head) {
      int len = 0;
      int count = 0;
      ListNode curr = head;
        while(curr != null){
          count++;
          curr =  curr.next;
        }

        count = (count/2);

        while(count > 0){
          count--;
          head =  head.next;
        }

        return head;
    }
}