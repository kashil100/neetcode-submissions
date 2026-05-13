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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        ListNode head = list1;
        ListNode temp = list2;
        ListNode swap = null;
        while(head != null){
            int val = head.val;
            while(temp != null){
                if(temp.val >= val){
                    ListNode sec = new ListNode(val, temp);
                    if(swap == null){
                        list2 = sec;
                        swap = list2;
                    }else{
                        swap.next = sec;
                        swap = sec;
                    }
                    break;
                }
                swap = temp;
                temp = temp.next;
                if(temp == null){
                    ListNode sec = new ListNode(val, null);
                    swap.next = sec;
                    temp = sec;
                    break;
                }
            }
            head = head.next;
        }

        return list2;
        
    }
}