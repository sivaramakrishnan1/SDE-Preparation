import java.util.Scanner;

public class AdminLogIn extends AccountHolderLogIn {
    int limit = 0;
    Account admins[] = new Account[20];
    Scanner s = new Scanner(System.in);
    AccountHolderLogIn user = new AccountHolderLogIn();
    /**
     * Admin Log in page. This function asks the login credentials of an admin. 
     */
    public void AdminLogInPage()
    {
        initialize();
        boolean loop = true;
        
        while (loop) {
            printsBank();

            System.out.print("\nEnter your ID: ");
            int Id = s.nextInt();

            System.out.print("\nEnter your password : ");

            if(admins[(Id - 1001)].checkPassword(encryptPassword(s.next())))
            {
                loggedInAsAdmin(Id);
                break;
            }
            else
            {
                System.out.print("\nEither the password or the Id is mismatching. Please try again. ");
            }
        }        
    }

    /**
     * All the functionalities of a admin will be here. 
     * i. Add account , ii. Remove Account , iii. Change Password for an account 
     */
    void loggedInAsAdmin(int id)
    {
        int choice;
        do
        {
            printsBank();

            System.out.print("\n\t\t 1. Add account" + 
            "\n\t\t 2. Remove Account" +
            "\n\t\t 3. Change Password for an account" + 
            "\n\t\t 4. Exit");

            System.out.print("\nEnter your choice : ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                {
                    addAccount();
                    break;
                }
                case 2:
                {
                    removeAccount();
                    break;
                }
                case 3: 
                {
                    changePassword();
                    break;
                }
                case 4:
                {
                    choice = 0;
                    break;
                }
                default:{
                    System.out.print("\nNot an option from the list. Choose again. ");
                    break;
                }
            }
        }while(choice != 0);
    }

    /**
	 * Prints the banner
	 */
	public void printsBank() {
		System.out.print("\n\t\t***************************");
		System.out.print("\n\t\t** B E T T E R   B A N K **");
		System.out.print("\n\t\t***************************");
	}

    /**
     * Initalize two admins account
     */
    public void initialize(){
        admins[0] = new Account(1001 , "Siva" , encryptPassword("Siva"));
        admins[1] = new Account(1002 , "Amar" , encryptPassword("Amar"));        
    }

    /**
	 * Encrypts the password circularly. For eg.: a -> b , z -> a.
	 * 
	 * @param password (plain text)
	 * @return pass (encrypted password)
	 */
    public String encryptPassword(String password) {
		String pass = "";
		for (char p : password.toCharArray()) {
			if ((int) p == 57)
				pass += (char) 48;
			else if ((int) p == 90)
				pass += (char) 65;
			else if ((int) p == 122)
				pass += (char) 97;
			else
				pass += (char) (p + 1);
		}
		return pass;
	}

    void addAccount()
    {
        System.out.print("\nAccount number : ");
        int accountNumber = s.nextInt();

        System.out.print("\nName : ");
        String name = s.next();

        System.out.print("\nPassword : ");
        String password = s.next();

        System.out.print("\nConfirm Password : ");
        String cPassword = s.next();

        if(!password.equals(cPassword))
        {
            System.out.print("\nPassword Mismatch. Process ended. No changes made. ");
        }
        cPassword = null;
        password = user.encryptPassword(password);

        System.out.print("\nCurrent Balance : ");
        int balance = s.nextInt();

        accounts[limit] = new Account(limit++, accountNumber, name, balance, password);
    }

    void removeAccount()
    {
        System.out.print("\nEnter the account number to remove it : ");
        int accountNumber = s.nextInt();

        int id = findAccount(accountNumber);

        boolean result = accounts[id].removeAccount();

        if(result) System.out.print("\nAccount removed successfully! ");
        else System.out.print("\nAccount is not removed.");
    }

    void changePassword() 
    {
        System.out.print("\nEnter the account number : ");
        int id = user.findAccount(s.nextInt());

        System.out.print("\nEnter the new password : ");
        changePassword(s.next(), id);

    }

    public void changePassword(String newPassword, int id)
	{
		accounts[id].changePassword(encryptPassword(newPassword));
	}
}
