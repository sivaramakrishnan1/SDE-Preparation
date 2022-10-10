#include <iostream>
using namespace std;

int main()
{
    int size;
    cin >> size;
    int nums[size];

    for (int i = 0; i < size; i++)
        cin >> nums[i];

    int val = 0;
    cin >> val;

    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if ((nums[i] == nums[j]))
            {
                nums[j] = INT_MAX;
            }
        }
    }
    
    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (nums[i] != INT_MAX && nums[j] != INT_MAX && nums[i] + nums[j] == val )
            {
                cout << "( " << nums[i] << " , " << nums[j] << " )" << endl;
            }
        }
    }
}