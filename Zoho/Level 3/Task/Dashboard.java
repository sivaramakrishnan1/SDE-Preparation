package com.Task;

import java.sql.SQLException;
import java.util.Scanner;

public class Dashboard {

	public static void main(String[] args) throws SQLException {
		
		Scanner s = new Scanner(System.in);
		ManageTask task = new ManageTask();
		ManageStatus status = new ManageStatus();
		Views view = new Views();
		
		boolean loop = true;

		while (loop) {
			System.out.println("~ D A S H B O A R D ~");
			System.out.println("\n  1. Manage Tasks" + "\n  2. Manage Status" + "\n  3. View Tasks" + "\n  4. Exit");
			System.out.println("Your choice : ");

			switch (s.nextInt()) {
			case 1: {
				task.manageTask();
				break;
			}

			case 2: {
				status.manageStatus();
				break;
			}

			case 3: {
				view.viewTasks();
				break;
			}

			case 4: {
				loop = false;
				break;
			}
			default: {
				System.out.println("Enter an option from the menu");
			}
			}
		}
		s.close();	
	}
}
