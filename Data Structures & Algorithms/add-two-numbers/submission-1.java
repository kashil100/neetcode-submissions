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
        int sum = l1.val + l2.val;
        ListNode ans = new ListNode(sum%10,null);
        l1 = l1.next;
        l2 = l2.next;
        int temp = sum/10;
        ListNode sec = ans;
        while(l1!=null && l2!=null){
            sum = l1.val + l2.val + temp;
            ListNode lt = new ListNode(sum%10,null);
            sec.next = lt;
            sec = lt;
            temp = sum/10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null ){
            sum = l1.val + temp;
            ListNode lt = new ListNode(sum%10,null);
            sec.next = lt;
            sec = lt;
            temp = sum/10;
            l1 = l1.next;
        }

        while(l2!=null){
            sum = l2.val + temp;
            ListNode lt = new ListNode(sum%10,null);
            sec.next = lt;
            sec = lt;
            temp = sum/10;
            l2 = l2.next;
        }

        if(temp !=0){
            ListNode lt = new ListNode(temp, null);
            sec.next = lt;
        }        
        return ans;
    }
}
