import java.util.Scanner;

class account
{
    private int CustId;
    private int AccountNo;
    private String name;
    private int balance;
    private String EncryptedPwd;

    account(int CustId , int AccountNo , String name, int balance, String EncryptedPwd)
    {
        this.CustId = CustId;
        this.AccountNo = AccountNo;
        this.name = name;
        this.balance = balance;
        this.EncryptedPwd = EncryptedPwd;
    }

    public int withdraw(int cashToWithdraw)
    {
        this.balance -= cashToWithdraw;
        return cashToWithdraw;
    }

    int getBalance()
    {
        return this.balance;
    }
}

class bank
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        account accounts[] = new account[100];

        int accountNo , balance;
        String name , pswd, cpswd;
        
        for(int i = 0 ; i < 2 ; i++)
        {
            System.out.println("Account number : ");
            accountNo = s.nextInt();

            System.out.println("Name : ");
            name = s.next();

            System.out.println("Balance : ");
            balance = s.nextInt();

            // gets password until the passwords are same
            do {
            System.out.println("Password : ");
            pswd = s.next();

            System.out.println("Confirm Password : ");
            cpswd = s.next(); 
            } while(!pswd.equals(cpswd));

            cpswd = "";

            // encrypt password
            for(int j = 0 ; j < pswd.length() ; j++)
            {
                cpswd += (char)(pswd.charAt(j) + 1);
            }
            
            accounts[i] = new account(i, accountNo, name, balance, cpswd);

            System.out.println("===========================================");
        }
 
        // accounts[0] = new account(0, 110, "Siva", 456, "Siva");

        System.out.println(accounts[0].getBalance());
        s.close();
    }
}