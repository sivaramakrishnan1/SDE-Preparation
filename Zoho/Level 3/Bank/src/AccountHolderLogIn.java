import java.util.Scanner;

public class AccountHolderLogIn {

	Account accounts[] = new Account[100];
	Scanner s = new Scanner(System.in);

	/**
	 * Log-in page for account holder
	 */
	public void userLogIn() {
		initialize();
		int accountNumber = 0;
		String password = "";
		boolean loop = true;

		while (loop) {
			printsBank();
			

			System.out.print("\nEnter Account number : (Enter 0 to exit)");
			accountNumber = s.nextInt();

			if(accountNumber == 0) break;

			System.out.print("\nEnter Password : ");
			password = s.next();
			password = encryptPassword(password);

			int id = findAccount(accountNumber);

			if (id == -1) {
				System.out.print("\nThe account number you entered doesn't exist.\n Please check your account number\n");
			} else {
				if (accounts[id].checkPassword(password)) {
					loggedIn(id);
					loop = false;
				} else {
					System.out.print("\nPassword Mismatch! \n try again!! \n");
					break;
				}
			}
		}
	}
	
	/**
	 * Home page of Account holder after log in
	 * 
	 * @param id
	 */
	public void loggedIn(int id) {
		int choice = 0;
		boolean loop = true;
		printsBank();

		while (loop) {
			System.out.print("\n============================================================");
			System.out.print("\nHello " + accounts[id].getName());
			System.out.print("\n1. Balance Check \n" +
					"2. Cash Withdraw \n" +
					"3. Cash Transfer \n" +
					"4. Exit" +
					"Your choice : ");

			choice = s.nextInt();
			switch (choice) {
				case 1: {
					System.out.print("\nCurrently your account balance is : " + accounts[id].getBalance());
					break;
				}

				case 2: {
					withdraw(id);
					break;
				}

				case 3: {
					System.out.print("\nEnter recepient account number : ");
					int accountNumber = s.nextInt();
					int id2 = findAccount(accountNumber);

					System.out.print("\nEnter your password : ");
					String password = encryptPassword(s.next());

					if (accounts[id].checkPassword(password)) transfer(id, id2);
					else System.out.print("\nPassword mismatch ");
					break;
				}

				default: {
					System.out.print("\nAre you sure you want to exit ? (y/n)");
					if (s.next().equals("y"))
						loop = false;
					else
						continue;
				}
			}
		}
	}

	/**
	 * Initializes two accounts to work and test. 
	 * ! Soon to be removed. 
	 */
	public void initialize()
	{
		accounts[0] = new Account(0, 123, "Siva", 5000 ,encryptPassword("siva") );
		accounts[1] = new Account(1, 124, "ram", 5000 ,encryptPassword("ram") );
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
	 * Returns the CustId to identify the account. Returns -1 if there is no such
	 * account
	 * 
	 * @param accountNumber
	 * @return ID (if it exist)
	 */
	public int findAccount(int accountNumber) {
		for (int i = 0; accounts[i] != null; i++) {
			if (accounts[i].getAccountNumber() == accountNumber)
				return i;
		}
		return -1;
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

	/**
	 * Reduces amount from the account's balance. 
	 * @param id
	 */
	public void withdraw(int id) {
		System.out.print("Enter the ammount to withdraw : ");
		int cashToWithdraw = s.nextInt();
		if (cashToWithdraw > accounts[id].getBalance())
			System.out.println("\nNot enough fund to withdraw");
		else
			System.out.print("\nRs. " + accounts[id].withdraw(cashToWithdraw)
					+ " has been withdrew from your account");
	}

	/**
	 * The Id of the sender and the recipient is enough. This function will get the amount to be transferred and changes that amount. 
	 * @param sender
	 * @param receiver
	 */
	public void transfer(int sender, int receiver) {
		System.out.print("/nEnter the ammount to Transfer : ");
		int cashToTransfer = s.nextInt();
		if (cashToTransfer > accounts[sender].getBalance())
			System.out.print("/nNot enough fund to withdraw");
		else
			accounts[sender].withdraw(cashToTransfer);
		System.out.print("/nRs. " + accounts[receiver].addAmount(cashToTransfer)
				+ " has been transfered to " + accounts[receiver].getName() + " from your account");
	}
}