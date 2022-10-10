#include<conio.h>
#include<string.h>
#include<iostream>

class account
{
    public:
    int CustId;
    int AccountNo;
    char name[100];
    int balance;
    char EncryptedPwd[100];
};

int main()
{
    account accounts[10];
    char pswd[100];
    char cpswd[100];

    accounts[0].name = "Siva";

    cout << accounts[0].name;


    for (int i = 0; i < 2; i++)
    {
        accounts[i].CustId = i;
        cout << "Account no : ";
        cin >> &accounts[i].AccountNo;

        cout << "Name : ";
        cin >> accounts[i].name;

        cout << "Balance : ";
        cin >> accounts[i].balance;

        do
        {
            printf("Password : ");
            scanf("%s" , &pswd);
            printf("Confirm Password : ");
            printf("\n");
            scanf("%s" , &cpswd);
        } while (strcmp(pswd,cpswd));

        // encryption
        for(int j = 0 ; j < sizeof(pswd) ; i++)
        {
            cpswd[j] = pswd[j] + 1;
        }  

        strcpy ( &accounts[i].EncryptedPwd , puts(cpswd));
    }
    printf("%d" , accounts[0].balance);
}