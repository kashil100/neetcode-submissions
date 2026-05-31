/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node l1) {
        if(l1 == null){
            return l1;
        }
        Map<Node, Node> mp = new HashMap<>();
        Node ans = new Node(l1.val);
        Node sec = ans;

        mp.put(l1, ans);
        Node head = l1.next;
        while(head != null){
            Node l2 = new Node(head.val);
            sec.next = l2;
            sec = l2;
            mp.put(head, l2);
            head = head.next;
        }
        sec = ans;
        while(l1 !=null){
            if(mp.containsKey(l1.random)){
                sec.random = mp.get(l1.random);
            }
            sec = sec.next;
            l1 = l1.next;
        }

        return ans;
        
    }
}
