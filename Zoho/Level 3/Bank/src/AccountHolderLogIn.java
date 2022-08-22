import java.util.Scanner;

public class AccountHolderLogIn {

	Account accounts[] = new Account[100];
	Scanner s = new Scanner(System.in);

	/**
	 * Log-in page for account holder
	 */
	public void userLogIn() {
		int accountNumber = 0;
		String password = "";
		boolean isAccountVerified = false;

		while (!isAccountVerified) {
			printsBank();

			System.out.println("Enter Account number : ");
			accountNumber = s.nextInt();

			if (accountNumber == -1)
				break;

			System.out.println("Enter Password : ");
			password = s.next();
			password = encryptPassword(password);

			int id = findAccount(accountNumber);

			if (id == -1) {
				System.out
						.println("The account number you entered doesn't exist.\n Please check your account number\n");
			} else {
				if (accounts[id].checkPassword(password)) {
					loggedIn(id);
					isAccountVerified = true;
				} else {
					System.out.println("Password Mismatch! \n try again!! \n");
					continue;
				}
			}

		}
	}

	/**
	 * Prints the banner 
	 */
	public void printsBank() {
		System.out.println();
		System.out.println("\t\t***********");
		System.out.println("\t\t* B A N K *");
		System.out.println("\t\t***********");
		System.out.println();
	}

	/**
	 * Returns the CustId to identify the account. Returns -1 if there is no such account
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
	 * Home page of Account holder after log in
	 * @param id
	 */
	public void loggedIn(int id) {
		int choice = 0;

		while (true) {
			printsBank();
			System.out.println("Hello " + accounts[id].getName());
			System.out.println("\n\t\t1. Balance Check \n\t\t" +
					"2. Cash Withdraw \n\t\t" +
					"3. Cash Transfer \n\t\t" +
					"4. Exit \n\n" +
					"Your choice : ");

			choice = s.nextInt();
			switch (choice) 
			{
				case 1: {
					System.out.println("Currently your account balance is : " + accounts[id].getBalance());
				} 
				
				case 2: {
					withdraw(id);
				} 
				
				case 3: {
					System.out.println("Enter recepient account number : ");
					int accountNumber = s.nextInt();
					int id2 = findAccount(accountNumber);
					String password = s.next();
					password = encryptPassword(password);
					if(accounts[id2].checkPassword(password)) transfer(id , id2);
					else {
						System.out.println("Password mismatch ");
						continue;
					}
				}

				default : {
					System.out.println("Are you sure you want to exit ? (y/n)");
					if(s.next().equals("y")) break;
					else continue;
				}

			}
		}
	}

	public void withdraw(int id) {
		System.out.println("Enter the ammount to withdraw : ");
		int cashToWithdraw = s.nextInt();
		if (cashToWithdraw > accounts[id].getBalance())
			System.out.println("Not enough fund to withdraw");
		else
			System.out.println("Rs. " + accounts[id].withdraw(cashToWithdraw)
					+ " has been withdrew from your account");
	}

	public void transfer(int sender , int receiver) {
		System.out.println("Enter the ammount to Transfer : ");
		int cashToTransfer = s.nextInt();
		if (cashToTransfer > accounts[sender].getBalance())
			System.out.println("Not enough fund to withdraw");
		else
			accounts[sender].withdraw(cashToTransfer);
			System.out.println("Rs. " + accounts[receiver].addAmount(cashToTransfer)
					+ " has been transfered to " + accounts[receiver].getName() + " from your account");
	}
}
