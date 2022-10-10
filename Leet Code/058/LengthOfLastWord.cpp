#include <iostream>
#include <string.h>
using namespace std;

class LengthOfLastWord
{
public:
    int lengthOfTheLastWord(string s)
    {
        int count = 0, size = s.length() -1;
        cout << s[size] << " ";

        while (size > -1 && s[size] == ' ')
            size--;

        while (size > -1 && s[size] != ' ')
        {
            size--;
            count++;
        }

        return count;
    }
};

int main()
{
    string str = "   fly me   to   the moon  ";
    LengthOfLastWord lastWordLength;
    cout << lastWordLength.lengthOfTheLastWord(str);
    return 0;
}