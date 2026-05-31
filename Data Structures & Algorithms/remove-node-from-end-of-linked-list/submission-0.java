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
    public int size(ListNode head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        n = size(head) - n +1;

        if(n == 1){
            return head.next;
        }
        ListNode temp = head;
        ListNode sec = head;

        while(temp != null){
            if(n == 2){
                sec = temp;
            }else if(n == 1){
                sec.next = temp.next;
                break;
            }

            temp = temp.next;
            n--;
        }

        return head;

    }
}
