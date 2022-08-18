#include<stdio.h>

void makePattern(int n)
{
    char s[100] = "1";
    
    for(int i = 0 ; i < n ; i++)
    {
        s = createLine(s);
    }
}

void createLine(char s[])
{
    for(int i = 0 ; i < sizeof(s) / sizeof(s[0]) ; i++)
    {
        int count = 1;
        while( i != sizeof(s))
    }

}

int main()
{
    int rows = 5;
    makePattern(rows);
    return 0;
}