import java.util.Scanner;

public class Bank_CLI {
	public static void main(String args[]) {
		AccountHolderLogIn user = new AccountHolderLogIn();
		AdminLogIn admin = new AdminLogIn();
		int choice = 0;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("\t\t***********");
			System.out.println("\t\t* B A N K *");
			System.out.println("\t\t***********");
			System.out.println();

			System.out.println("\t\t1. Account holder Login "
					+ "\n\t\t2. Admin Login ");

			choice = s.nextInt();

			switch (choice) {
				case 1: {
					user.userLogIn();
					break;
				}
				case 2: {
					System.out.println("Withdraws");
				}
				default: {
					break;
				}
			}

		}
	}

}
