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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 1;
        ListNode temp = head;
        ListNode ans = head;
        ListNode sec1 = null, sec2 = null , sec3 = null;
        while(head!=null){
            if(count >= left){
                if(count == left){
                    sec1 = head;
                    sec3 = head;
                }
                sec2 = head.next;
                head.next = sec3;
                sec3 = head;

                if(count == right){
                    temp.next = head;
                    sec1.next = sec2;
                    if(left == 1){
                        ans = head;
                    }
                    break;
                }

                head = sec2;
                count++;
                continue;
            }

            count++;
            temp = head;
            head = head.next;
        }

        return ans;
    }
}