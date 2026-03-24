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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger ans = getNum(l1).add(getNum(l2));
        return getListNode(ans);
    }

    private BigInteger getNum(ListNode head) {
        BigInteger sum = BigInteger.ZERO;
        int power = 0;
        while (head != null) {
            sum = sum.add(BigInteger.valueOf(10).pow(power++).multiply(BigInteger.valueOf(head.val)));
            head = head.next;
        }
        return sum;
    }

    private ListNode getListNode(BigInteger n) {
        ListNode head = null;
        ListNode itrNode = null;
        while (!n.equals(BigInteger.ZERO)) {
            BigInteger val = n.mod(BigInteger.TEN);
            ListNode newNode = new ListNode(val.intValue());
            if (head == null) {
                head = newNode;
                itrNode = head;
            } else {
                itrNode.next = newNode;
                itrNode = itrNode.next;
            }
            n = n.divide(BigInteger.TEN);
        }
        if (head == null) {
            head = new ListNode(0);
        }
        return head;
    }
}
