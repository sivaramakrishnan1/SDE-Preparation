#include<iostream>
using namespace std;

public int[] sortNumbers(int nums[])
{
    for(int i = 0 ; i < 3 ; i++)
    {
        cout << nums[i];
    }

    return nums;
}

int main()
{
    int size;
    cin >> size;
    int nums[size];

    for (int i = 0; i < size; i++)
        cin >> nums[i];

    nums = sortNumbers(nums);
}