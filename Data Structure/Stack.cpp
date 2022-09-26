/**
 * *All functionalities of a (LIFO) Stack operation.
 * 1. Push - adds element at the top
 * 2. Pop - removes element at the top
 * 3. Top - prints element at the top, but not removes.
 * */

#include <iostream>

using namespace std;

/**
 * Frame of Stack
 */
class stack
{
public:
    int val;
    stack *next;
};

/**
 * Pushes(adds) element to the stack. 
 * @param **topNode pointer to the head of the pointer
 * @param value value of the top element on the stack to be added
 */
void push(stack **topNode, int value)
{
    stack *newNode = new stack();

    newNode->val = value;

    if (*topNode == NULL)
    {
        *topNode = newNode;
        (*topNode)->next = NULL;
        return;
    }

    newNode->next = (*topNode);
    (*topNode) = newNode;
}

/**
 * Pops(removes) top element available in the stack. 
 * @param *head pointer to the top of the stack.
 */
void pop(stack **head)
{
    stack *first = *head;

    if (first == NULL)
    {
        cout << endl
             << "Stack underflow, nothing in stack" << endl
             << endl;
        return;
    }

    cout << endl
         << first->val << endl
         << endl;

    *head = (*head)->next;
}

/**
 * Prints top element available in the stack. 
 * @param head pointer to the top of the stack.
 */
void top(stack *head)
{
    if(head == NULL) 
    {
        cout << endl
             << "Stack underflow, nothing on top" << endl
             << endl;
        return;
    }
    cout << endl
         << head->val << endl
         << endl;
}

/**
 * Prints every element available in the stack. 
 * @param head pointer to the top of the stack.
 */
void printAll(stack *head)
{
    stack *node = head;

    if (head == NULL)
    {
        cout << endl
             << "Stack empty" << endl
             << endl;
        return;
    }
    cout << endl;
    while (node != NULL)
    {
        if (node->next == NULL)
        {
            cout << node->val << endl
                 << endl;
            return;
        }
        cout << node->val << ",";
        node = node->next;
    }
}

int main()
{
    stack *s = new stack();
    s = NULL;

    int choice = 1;

    while (choice != 0)
    {
        cout << endl
             << "1. Push " << endl
             << "2. Pop " << endl
             << "3. Top " << endl
             << "4. Print " << endl
             << "5. Exit" << endl
             << "Enter your choice : ";
        cin >> choice;

        int allValue = 0;
        switch (choice)
        {
        case 1:
        {
            // To push
            cout << "Enter value to be pushed : ";
            cin >> allValue;
            // it is necessary to send the address of the class object, which points to the head.
            push(&s, allValue);
            break;
        }

        case 2:
        {
            // To pop / remove the top element
            pop(&s);
            break;
        }

        case 3:
        {
            // prints the top element
            top(s);
            break;
        }

        case 4:
        {
            // prints every element from the stack
            printAll(s);
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