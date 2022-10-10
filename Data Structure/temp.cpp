#include<iostream>
#include<string>

using namespace std;

int main()
{
    string s = "";
    char c = 's';
    for(int i=0 ; i<5 ; i++)
    {
        s += c;
    }

    cout << s;
    return 0;
}