/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
         struct ListNode* NextNode = node->next;
         node->val = NextNode->val;
         node->next = NextNode->next;
         free(NextNode);
}