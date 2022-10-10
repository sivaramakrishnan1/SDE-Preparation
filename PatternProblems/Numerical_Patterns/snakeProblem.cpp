#include<bits/stdc++.h>

using namespace std;

int main()
{
    int limit = 5;
    int offset = 1, val = 0;

    for (int i = 0; i < limit; i++)
    {
        for(int j = 0 ; j < limit ; j++)
        {
            val += offset;
            cout << val <<  " ";
        }
        cout << endl;
        val += limit + offset;

        offset *= -1;
    }
    
}
