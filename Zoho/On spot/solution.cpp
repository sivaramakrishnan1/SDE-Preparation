#include <iostream>
#include <string>
using namespace std;

// Suhail !@ an&&d Vishn#^u anna d^#oi&&ng pro@gr!am
// / !@#^^#@!

bool isSpecialChar(char c)
{
    if (c == ' ' || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
        return true;
    else
        return false;
}

int main()
{
    string input = ".,.a,.";

    int front = 0, back = input.length() - 1;
    int length = input.length() - 1;

    while (front < back)
    {
        while (front < length && isSpecialChar(input[front]))
        {
            front++;
        }
        while (back > 0 && isSpecialChar(input[back]))
        {
            back--;
        }
        cout << "Checking " << input[front] << " " << input[back] << endl;

        if (input[front] != input[back])
        {
            cout << "not same";
            return 0;
        }
        front++;
        back--;
    }

    cout << "same";
    return 0;
}