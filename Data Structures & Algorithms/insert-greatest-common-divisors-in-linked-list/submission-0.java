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
    public int gcd(int a, int b){
        int ans = 1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i ==0 && b%i==0){
                ans = i;
            }
        }

        return ans;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        int a = head.val;
        ListNode temp = head.next;
        ListNode prev = head;
        if(temp == null){
            return head;
        }

        while(temp!=null){
            int b = temp.val;
            int n = gcd(a,b);
            ListNode sec = new ListNode(n,temp);
            prev.next = sec;
            prev = temp;
            temp = temp.next;
            a = b;
        }

        return head;
        
    }
}