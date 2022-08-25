import java.util.Scanner;

public class Bank_CLI {
	public static void main(String args[]) {
		AccountHolderLogIn user = new AccountHolderLogIn();
		AdminLogIn admin = new AdminLogIn();
		int choice = 0;
		Scanner s = new Scanner(System.in);
		boolean loop = true;		

		while (loop) {			
			printsBank();

			System.out.print("\n\n\t\t1. Account holder Login "
					+ "\n\t\t2. Admin Login "
					+ "\n\t\t3. Exit"
					+ "\n\n\t\tEnter your choice : ");

			choice = s.nextInt();

			switch (choice) {
				case 1: {
					user.userLogIn();
					break;
				}
				case 2: {
					admin.AdminLogInPage();
					break;
				}
				case 3: {
					loop = false;
					break;
				}
				default: {
					System.out.println("\t\tNot an option from the list. \n\t\tPlease try again.");
					break;
				}
			}
		}
	}

	/**
	 * Prints the banner
	 * @return void
	 */
	public static void printsBank() {
		System.out.print("\n\t\t***************************");
		System.out.print("\n\t\t** B E T T E R   B A N K **");
		System.out.print("\n\t\t***************************");
	}
}