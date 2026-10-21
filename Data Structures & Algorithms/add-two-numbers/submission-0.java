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
        
        ListNode currl1 = l1;
        ListNode currl2 = l2;
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        int carry = 0;
        while (currl1 != null || currl2 != null || carry != 0){
            
            int sum = carry;

  
            if (currl1 != null){
            sum += currl1.val;
            currl1 = currl1.next;

            }

            if(currl2 != null){
                sum += currl2.val;
                currl2 = currl2.next;
            }

            carry = sum / 10;
            int digit = sum % 10;

            curr.next = new ListNode(digit);
            curr = curr.next;


        } 

        return dummy.next;
        
    }
}
