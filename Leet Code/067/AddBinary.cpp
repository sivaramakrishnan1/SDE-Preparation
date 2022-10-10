#include <iostream>
#include <string.h>
using namespace std;

string addBinary(string a, string b)
{
    int aLen = a.length() - 1, bLen = b.length() - 1, carry = 0;
    string res[(aLen > bLen) ? aLen : blen];

    while (aLen > -1 && bLen > -1)
    {
        if (a[aLen] == '1' && b[blen] == '1')
        {
            if (carry == 1)
            {
                res = '1' + res;
                continue;
            }
            res = '0' + res;
            carry = 1;
        }
        else if(a[aLen] == '0' && b[blen] == '0')
        {
            if(carry)
            {
                res= '1' + res;
                carry = 0;
                continue;
            }
            res = '0' + res;
        }
        else 
        {
            if(carry)
            {
                res = '0' + res;
                continue;
            }
            res = '1' + res;
        }

        pos--;
        aLen--;
        bLen--;
    }

    return (carry == '1') ? ;
}

int main()
{
    string a = "1010", b = "1011";

    cout << addBinary(a, b)
}