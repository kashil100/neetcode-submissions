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
    ListNode sec;

    public void fun(ListNode temp){
        if(temp == null){
            return;
        }

        fun(temp.next);

        if(sec == null){
            return;
        }

        if(sec == temp || sec.next == temp){
            temp.next = null;
            sec = null;
            return;
        }

        ListNode l1 = sec.next;
        sec.next = temp;
        sec = temp;
        sec.next = l1;
        sec = l1;
    }
    public void reorderList(ListNode head) {
        sec = head;
        fun(head);
    }
}
