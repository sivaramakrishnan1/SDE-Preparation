#include <iostream>
#include <conio.h>
#include <string>
using namespace std;

class Node
{
public:
    int val;
    Node *left;
    Node *right;
};

void insert(Node **head, int value)
{
    if (*head == NULL)
    {
        *head = new Node;
        (*head)->val = value;
        (*head)->left = NULL;
        (*head)->right = NULL;
        return;
    }

    if ((*head)->val < value)
        insert(&(*head)->right, value);
    else
        insert(&(*head)->left, value);
}

string treeSearch(Node **head, int value)
{
    if ((*head) == NULL)
        return "Empty Tree";

    string address = "";

    if ((*head)->val == value)
    {
        string s = "here";
        return s;
    }
    else if ((*head)->val > value)
        return "Left -> " + (treeSearch(&((*head)->left), value));
    else if ((*head)->val < value)
        return "Right -> " + (treeSearch(&((*head)->right), value));
}

void LTR_Print(Node **head)
{
    if ((*head) != NULL)
    {
        LTR_Print(&(*head)->left);
        cout << (*head)->val << " , ";
        LTR_Print(&(*head)->right);
    }
}

void RTL_Print(Node **head)
{
    if ((*head) != NULL)
    {
        RTL_Print(&(*head)->right);
        cout << (*head)->val << " , ";
        RTL_Print(&(*head)->left);
    }
}

void destroy(Node **head)
{
    if ((*head) != NULL)
    {
        destroy(&(*head)->left);
        destroy(&(*head)->right);
        delete *head;
    }
}

int main()
{
    Node *head = NULL;

    int choice = 1;

    while (choice != 0)
    {

        cout << endl
             << endl
             << "1. Insert " << endl
             << "2. Search " << endl
             << "3. Left to right print " << endl
             << "4. Right to left print " << endl
             << "5. Demolish" << endl
             << "6. Exit" << endl
             << "Enter your choice : ";
        cin >> choice;

        cout << endl;
        int allValue = 0;
        switch (choice)
        {
        case 1:
        {
            // To insert
            cout << "Enter value to be insert : ";
            cin >> allValue;
            insert(&head, allValue);
            break;
        }

        case 2:
        {
            cout << "Enter value to search : ";
            cin >> allValue;
            string s = treeSearch(&head, allValue);
            // To search for an element
            cout << s;
            break;
        }

        case 3:
        {
            // prints every element left to right in the binary search tree
            LTR_Print(&head);
            break;
        }

        case 4:
        {
            // prints every element right to left in the binary search tree
            RTL_Print(&head);
            break;
        }

        case 5:
        {
            // Erases *all* the values and deletes the nodes in BST.
            destroy(&head);
            break;
        }

        case 6:
        {
            // Exit
            choice = 0;
            break;
        }

        default:
            cout << "Not an option from the menu";
            break;
        }
    }
    return 0;
}
