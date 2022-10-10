#include <iostream>
using namespace std;

int mySqrt(int x)
{
    if (x <= 0)
        return 0;
    if (x == 1)
        return 1;

    long root = x / 2;

    while (root > -1)
    {
        if ((root * root) <= x)
            return root;
        else
            root--;
    }

    return 0;
}

int main()
{
    int root = mySqrt(562464195);
    cout << root << " * " << root << " " << (root*root);
    return 0;
}