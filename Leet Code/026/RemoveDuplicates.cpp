#include <iostream>
#include <vector>
using namespace std;

int removeDuplicates(vector<int> &nums)
{
    if (nums.size() == 1)
        return 1;
    int pos = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        while (i + 1 < nums.size() && nums[i] == nums[i + 1])
        {
            i++;
        }
        nums[pos++] = nums[i];
    }
    return pos;
}

int main()
{
    int size;
    cout << "Size: ";
    cin >> size;

    vector<int> arr;
    for (int i = 0; i < size; i++)
    {
        int val;
        cin >> val;
        arr.push_back(val);
    }

    cout << removeDuplicates(arr);
    return 0;
}