#include<stdio.h>
#include<string.h>
#include<stdbool.h>

bool isSubsequence(char s[] , char t[])
{
    if(strlen(s) > strlen(t)) return false;

        int i=0, j=0;
        while(i < strlen(s))
        {
            if(s[i] != t[j]) 
            {
                ++j;
            }
            else 
            { 
                i++; 
                t[j] = '.';
            }
            if(j >= strlen(t)) return false;
        }
        return true; 
}


void main()
{
    char s[] = "abc", t[] = "abc";
    printf("%d", isSubsequence(s , t));
}

