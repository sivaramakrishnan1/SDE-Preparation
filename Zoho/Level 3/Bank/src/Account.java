public class Account {
    private int CustId = 0;
    private int AccountNo = 0;
    private String name = null;
    private int balance = 0;
    private String EncryptedPwd = null;

    Account(int CustId, int AccountNo, String name, int balance, String EncryptedPwd) {
        this.CustId = CustId;
        this.AccountNo = AccountNo;
        this.name = name;
        this.balance = balance;
        this.EncryptedPwd = EncryptedPwd;
    }

    public int getCustId() {
        return this.CustId;
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

    public int addAmount(int amount)
    {
        this.balance += amount;
        return amount;
    }
}
