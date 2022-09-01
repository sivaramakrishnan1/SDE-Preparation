import java.util.Scanner;

public class Account {
    Scanner s = new Scanner(System.in);
    private int Id = 0;
    private int AccountNo = 0;
    private String name = null;
    private int balance = 0;
    private String EncryptedPwd = null;

    Account(int Id, int AccountNo, String name, int balance, String EncryptedPwd) {
        this.Id = Id;
        this.AccountNo = AccountNo;
        this.name = name;
        this.balance = balance;
        this.EncryptedPwd = EncryptedPwd;
    }

    Account(int Id , String name, String EncryptedPwd)
    {
        this.Id = Id;
        this.name = name;
        this.EncryptedPwd = EncryptedPwd;
    }

    public void setId(int val)
    {
        this.Id = val;
    }

    public int getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public int getAccountNumber() {
        return this.AccountNo;
    }

    public int getBalance() {
        return this.balance;
    }

    public int withdraw(int cashToWithdraw) {
        this.balance -= cashToWithdraw;
        return cashToWithdraw;
    }

    public boolean checkPassword(String password) {
        if (password.length() != this.EncryptedPwd.length())
            return false;

        for (int i = 0; i < password.length(); i++) {
            if ((char) (this.EncryptedPwd.charAt(i) - 1) != (char) (password.charAt(i) - 1)) {
                return false;
            }
        }

        return true;
    }

    public void changePassword(String encryptedPassword)
    {
        this.EncryptedPwd = encryptedPassword;
    }

    public int addAmount(int amount)
    {
        this.balance += amount;
        return amount;
    }

    public boolean removeAccount()
    {
        boolean closeable = false;

        if(this.balance != 0)
        {
            System.out.println("\t\tThis account still have some fund in it. \n\t\tDo you want to delete it for sure ? (y/n)");
            String response = s.next();
            if(response.equals("y"))
            {
                closeable = true;
            } else {
                return false;
            }
        } else {
            closeable = true;
        }

        if(closeable)
        {
            this.Id = -1;
            this.name = null;
            this.AccountNo = -1;
            this.balance = -1;
            this.EncryptedPwd = null;
        }
        
        return true;
    }
}
