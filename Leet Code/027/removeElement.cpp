#include <iostream>
#include <vector>
using namespace std;

int removeElement(vector<int> &nums, int val)
{
    int pos = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        if(nums[i] == val) continue;
        nums[pos++] = nums[i];
    }

    return pos;
}

int main()
{
    vector<int> nums;
    cout << "Size: ";
    int size, val;
    cin >> size;

    for (int i = 0; i < size; i++)
    {
        cin >> val;
        nums.push_back(val);
    }
    cin >> val;

    for (int i = 0; i < removeElement(nums, val); i++)
    {
        cout << nums[i] << " ";
    }
    
    return 0;
}