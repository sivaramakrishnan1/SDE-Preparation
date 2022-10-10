#include <iostream>
using namespace std;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
struct ListNode
{
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode *removeElements(ListNode *head, int val)
{
    ListNode *newHead = new ListNode(-1);
    newHead->next = head;
    ListNode *prev = newHead, *curr = newHead->next;

    while (curr)
    {
        if (curr->val == val)
        {
            prev->next = curr->next;
            curr = curr->next;
            continue;
        }
        prev = prev->next;
        curr = curr->next;
    }

    return newHead->next;
}

int main()
{
    ListNode *head = new ListNode();
    ListNode *node = new ListNode;

    for (int i = 0; i < 7; i++)
    {
        cin >> node->val;
        node = node->next;
    }

    head = removeElements(head, 6);
    node = head;
    while (node != NULL)
    {
        cout << node->val;
        node = node->next;
    }
    return 0;
}