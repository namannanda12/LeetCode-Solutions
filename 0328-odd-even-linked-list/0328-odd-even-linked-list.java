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
    public ListNode oddEvenList(ListNode head) {
        //if there is no or only 1 node in linked list
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd=head;
        ListNode even=odd.next;
        ListNode join=even;
        
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            odd=even.next;

            even.next=odd.next;
            even=odd.next;
        }
        odd.next=join;
        return head;
    }
}