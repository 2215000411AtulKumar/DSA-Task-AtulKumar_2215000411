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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode head = temp; 
        int car =0;

        while(l1 !=null && l2 != null){
            int sum = l1.val +l2.val + car;
            int rem = sum%10;
            car = sum/10;
            ListNode node = new ListNode(rem);
            temp.next = node;
            l1 =l1.next;
            l2 =l2.next;
            temp =temp.next;
        }
        while(l1 != null){
            int sum = l1.val + car;
            int rem = sum%10;
            car = sum/10;
            ListNode node = new ListNode(rem);
            temp.next = node;
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2 != null){
            int sum = l2.val + car;
            int rem = sum%10;
            car = sum/10;
            ListNode node = new ListNode(rem);
            temp.next = node;
            l2 = l2.next;
            temp = temp.next;
        }
        if (car !=0 ){
            ListNode node = new ListNode(car);
             temp.next = node;
        }
        return head.next;
    }
}