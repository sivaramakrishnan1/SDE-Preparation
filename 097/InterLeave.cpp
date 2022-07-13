#include <iostream>
using namespace std;

bool findInterLeave(char s1[], char s2[], char s3[])
{
    int l1 = 0, l2 = 0;
    /* // TODO: this algorithm doesn't work either
    for (int i = 0; i <= sizeof(s3) / sizeof(s3[0]); i++)
    {
        if (s3[i] == s1[l1])
        {
            l1++; s3[i] = '0';
        }
        else if (s3[i] == s2[l2])
        {
            l2++; s3[i] = '0';
        }
    }

    for (int i = 0; i <= sizeof(s3) / sizeof(s3[0]); i++)
        if (s3[i] != '0')
            return false;
    */

    int count = 0, limit = 0;
    for (int i = 0; i <= sizeof(s1) / sizeof(s1[0]); i++)
    {
        if (s1[i] == s3[limit])
        {
            s3[limit++] = '0'; 
            s1[i] = '0';
            
            count++;
        }
    }

    limit = 0;
    for (int i = 0; i <= sizeof(s2) / sizeof(s2[0]); i++)
    {
        if (s2[i] == s3[limit])
        {
            s3[limit++] = '0'; 
            s2[i] = '0';

            count++;
        }
    }

    if(count == (sizeof(s3) / sizeof(s3[0]))) return true;
    return false;
}

int main(void)
{
    // correct
    // char s1[] = "aabcc", s2[] = "dbbca", s3[] = "aadbbcbcac";
    // wrong
    char s1[] = "aabcc", s2[] = "dbbca", s3[] = "aadbbcbca";

    bool result = false;
    result = findInterLeave(s1, s2, s3);
    if (result)
    {
        cout << "Ok";
    }
    else
    {
        cout << "nope";
    }
    return 1;
}
