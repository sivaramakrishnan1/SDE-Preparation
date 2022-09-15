package com.Task;

import java.util.Scanner;
import java.sql.SQLException;

public class Views {

	Scanner s = new Scanner(System.in);

	DataBase db = new DataBase();

	public void viewTasks() {

		boolean loop = true;

		while (loop) {
			System.out.print("\n1. View Tasks" + "\n2. View Status" + "\n3. View Open" + "\n4. View In Progress"
					+ "\n5. View Closed" + "\n6. Exit");

			switch (s.nextInt()) {
			case 1: {
				try {
					db.print(1, "Select * from tasktable");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
			case 2: {
				try {
					db.print(2, "Select * from statustable");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
			case 3: {
				try {
					System.out.println("\nTASKS");
					db.print(1, "Select * from tasktable where task_status = 1");
					System.out.println("\nSTATUS");
					db.print(2, "Select * from statustable where status_type = 1");
					break;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}

			case 4: {
				try {
					System.out.println("\nTASKS");
					db.print(1, "Select * from tasktable where task_status = 2");
					System.out.println("\nSTATUS");
					db.print(2, "Select * from statustable where status_type = 2");
					break;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}

			case 5: {
				try {
					System.out.println("\nTASKS");
					db.print(1, "Select * from tasktable where task_status = 3");
					System.out.println("\nSTATUS");
					db.print(2, "Select * from statustable where status_type = 3");
					break;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}

			case 6: {
				loop = false;
				break;
			}
			default: {
				System.out.println();
			}
			}
		}

	}
}
