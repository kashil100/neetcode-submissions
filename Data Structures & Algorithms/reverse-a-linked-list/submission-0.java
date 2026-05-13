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
        if(head == null || head.next == null) return head;

        ListNode sec = head;
        ListNode temp = head.next;
        head.next = null;
        head = temp;
        boolean check = false;
        while(head != null){
            if(head.next == null){
                check = true;
            }

            temp = head.next;
            ListNode swap = head;
            head.next = sec;
            sec = swap;
            head = temp;
            if(check){
                break;
            }
        }

        return sec;
    }
}
