#include<stdio.h>
#include<conio.h>
#include<string.h>

struct account
{
    int CustId;
    int AccountNo;
    char name[100];
    int balance;
    char EncryptedPwd[100];
}accounts[10];

int main()
{
    char pswd[100];
    char cpswd[100];

    for (int i = 0; i < 2; i++)
    {
        accounts[i].CustId = i;
        printf("Account no : ");
        scanf("%d", &accounts[i].AccountNo);

        printf("Name : ");
        scanf("%s", &accounts[i].name);

        printf("Balance : ");
        scanf("%d", &accounts[i].balance);

        do
        {
            printf("Password : ");
            scanf("%s" , &pswd);
            printf("Confirm Password : ");
            printf("\n");
            scanf("%s" , &cpswd);
        } while (pswd == cpswd);

        // encryption
        for(int j = 0 ; j < sizeof(pswd) ; i++)
        {
            cpswd[j] = pswd[j] + 1;
        }  

        strcpy ( accounts[i].EncryptedPwd , cpswd);
    }
    printf("%d" , accounts[0].balance);
}