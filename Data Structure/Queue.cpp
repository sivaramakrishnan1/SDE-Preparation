/**
 *  Queue - Functionalities
 */

#include <iostream>
using namespace std;

class queue
{
public:
    int val;
    queue *next;
};

void enqueue(queue **head, int value)
{
    queue *rear = *head;

    queue *node = new queue();
    node->val = value;
    node->next = NULL;

    if (*head == NULL)
    {
        *head = node;
        (*head)->next = NULL;
        return;
    }

    while(rear->next != NULL)
    {
        rear = rear->next;
    }

    rear->next = node;
}

void dequeue(queue **head)
{
    queue *node = *head;

    if ((*head) == NULL)
    {
        cout << endl
             << "Queue underflow, nothing to remove" << endl
             << endl;
        return;
    }

    if ((*head)->next == NULL)
    {
        cout << endl
             << (*head)->val << endl
             << endl;
        (*head) = NULL;
        return;
    }

    cout << endl
         << (*head)->val << endl
         << endl;

    (*head) = (*head)->next;
}

void top(queue *head)
{
    if(head == NULL)
    {
        cout << endl
         << "Queue is empty" << endl
         << endl;
         return;
    }
    cout << endl
         << head->val << endl
         << endl;
}

void printAll(queue *head)
{
    if (head == NULL)
    {
        cout << endl
             << "Empty node" << endl
             << endl;
             return;
    }

    queue *node = head;
    while (node != NULL)
    {
        if (node->next == NULL)
        {
            cout << node->val << endl
                 << endl;
                 return;
        }
        cout << node->val << "," ;
        node = node->next;
    }
}

int main()
{
    queue *q = NULL;
    int choice = 1;

    while (choice != 0)
    {
        cout << endl
             << "1. Enqueue " << endl
             << "2. Dequeue " << endl
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
            enqueue(&q, allValue);
            break;
        }

        case 2:
        {
            // To pop / remove the top element
            dequeue(&q);
            break;
        }

        case 3:
        {
            // prints the top element
            top(q);
            break;
        }

        case 4:
        {
            // prints every element from the stack
            printAll(q);
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
