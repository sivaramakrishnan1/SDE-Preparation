#include <iostream>
using namespace std;

/**
 * This file contains of functionalities of Linked list. Such as,
 * 1. A class template
 * 2. Push
 * 3. Pop
 * 4. Append
 * 5. Traverse
 *
 * */

/**
 * Template or frame of the list.
 * Contains a integer value and a pointer to
 * @param val Contains the value
 * @param *next points to the next frame or list
 */
class list
{
public:
    int val;
    list *next;
};

/**
 * @name Append
 *
 * Adds an element at the last of the list. if the list is empty
 * it creates a new node / frame.
 *
 * @param l Pointer to head of the list
 * @param value Value to be added at the end of the list
 * */
void append(list **node, int value)
{
    list *newNode = new list();
    newNode->val = value;
    newNode->next = NULL;

    if (*node == NULL)
    {
        *node = newNode;
        return;
    }

    list *last = *node;

    while ((last->next) != NULL)
    {
        last = last->next;
    }

    last->next = newNode;
}

/**
 * Prints all the element from the head to last.
 * @param node Pointer to head of the list
 */
void printList(list *node)
{
    if (node == NULL)
    {
        cout << endl
             << "EMPTY LIST!" << endl
             << endl;
        return;
    }

    cout << endl
         << "List elements : ";
    // prints list
    while (node != NULL)
    {
        if ((node->next) == NULL)
        {
            cout << node->val << endl
                 << endl;
            return;
        }
        cout << node->val << ", ";
        node = node->next;
    }
}

/**
 * Function to add an element at the beginning of the list.
 *
 * @param node Pointer to head of the list.
 * @param value Value to add at the beginning of a list.
 * */
void push(list **node, int value)
{
    list *newNode = new list();
    newNode->val = value;
    newNode->next = *node;
    *node = newNode;
}

/**
 * Function to remove a frame or node from the list.
 * @param node Pointer to the list
 * @param value Value to be removed from the list.
 */
void pop(list **node, int value)
{
    // Checks if the list is empty
    if (*node == NULL)
    {
        cout << endl
             << "Empty list, nothing to remove" << endl
             << endl;
        return;
    }

    // checks if the first value is to be reomved. if yes, then it will be removed.
    if ((*node)->val == value)
    {
        (*node) = (*node)->next;
        return;
    }

    list *head = *node; // pointer to head of the list.

    // traverses untill a match for the value has found.
    while ((head->next)->val != value)
    {
        head = head->next;
        if (head->next == NULL)
        {
            cout << endl
                 << "Overflow, can't find the element to delete" << endl
                 << endl; // if the traversing reaches the end of the list then it will print this and exits.
            return;
        }
    }

    head->next = (head->next)->next;
}

int main()
{
    list *newlist = NULL;

    int choice = 1;

    while (choice != 0)
    {
        cout << "1. Append " << endl
             << "2. Push " << endl
             << "3. Print " << endl
             << "4. Pop " << endl
             << "5. Exit" << endl
             << "Enter your choice : ";
        cin >> choice;

        int allValue = 0;
        switch (choice)
        {
        case 1:
        {
            // To append
            cout << "Enter value to be appended : ";
            cin >> allValue;
            // it is necessary to send the address of the class object, which points to the head.
            append(&newlist, allValue);
            break;
        }

        case 2:
        {
            // Adds a value at the front of the list.
            cout << "Enter value to be pushed : ";
            cin >> allValue;
            // it is necessary to send the address of the class object, which points to the head.
            push(&newlist, allValue);
            break;
        }

        case 3:
        {
            // Prints all the values in the list
            printList(newlist);
            break;
        }

        case 4:
        {
            // Removes(pops) element from the list by value.
            cout << "Enter value to be removed : ";
            cin >> allValue;
            // it is necessary to send the address of the class object, which points to the head.
            pop(&newlist, allValue);
            break;
        }

        case 5:
        {
            // exits
            choice = 0;
            break;
        }

        default:
            cout << "Not an aoption from the menu";
            break;
        }
    }

    return 0;
}