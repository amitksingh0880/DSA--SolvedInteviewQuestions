/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
          ListNode Next_Node = node.next;
          node.val = Next_Node.val;
          node.next = Next_Node.next;
        //   Next_Node.next = null;
    }
}