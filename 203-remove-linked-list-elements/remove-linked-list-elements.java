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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(0, head);
        ListNode copy = ans;

        while (copy != null) {
            while (copy.next != null && copy.next.val == val) {
                copy.next = copy.next.next;
            }
            copy = copy.next;
        }
        return ans.next;        
    }
}