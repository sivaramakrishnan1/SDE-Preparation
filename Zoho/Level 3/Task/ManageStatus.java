package com.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class ManageStatus {
	
	DataBase db = new DataBase();
	Scanner s = new Scanner(System.in);
	HashMap<Integer, String> map = new HashMap<>();

	
	public void manageStatus() {
		boolean choice = true;

		while (choice) {
			System.out.println("  1. Add new status" + "\n  2. Update status" + "\n  3. Delete status" + "\n  4. Previous option");
			System.out.print("Your choice : \n");

			switch (s.nextInt()) {
			case 1: {
				addStatus();
				break;
			}

			case 2: {
				updateStatus();
				break;
			}

			case 3: {
				deleteStatus();
				break;
			}

			case 4: {
				choice = false;
				break;
			}

			default: {
				System.out.println("Choose an option from the list. Try again.");
			}
			}
		}
	}

	private void addStatus() {
		System.out.println("Enter the status ID : ");
		int statusId = s.nextInt();

		if (isDuplicateId(statusId)) {
			System.out.println("Status ID already exists, try again");
			return;
		}

		System.out.println("Enter the status name : ");
		String statusName = s.nextLine();

		System.out.println("Enter the status : " + "\n1. Open" + "\n2. In Progress" + "\n3. Closed");
		int statusType = s.nextInt();

		if (statusType < 1 || statusType > 3) {
			System.out.println("Not an option from above. Try again. ");
			return;
		}

		try {
			String cmd = "INSERT INTO STATUSTABLE (STATUS_ID , STATUS_NAME , STATUS_TYPE ) VALUES( " + statusId + " , \"" + statusName + "\" , " + statusType + ")";
			db.runStatement(cmd);
			map.put(statusId, "Present");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Task : " + statusName + " added with the status : " + statusType);
		
	}

	private void updateStatus() {
		System.out.println("Enter the status ID : ");
		int statusId = s.nextInt();

		System.out.println("1. Open \n 2. In Progress \n3. Closed");
		
		int statusType = s.nextInt();
				

		if (statusType < 1 || statusType > 3) {
			System.out.println("Not an option from above. Try again. ");
			return;
		}

		try {
			String cmd = "UPDATE STATUSTABLE SET STATUS_TYPE = " + statusType + " WHERE STATUS_ID = " + statusId;
			db.runStatement(cmd);
			System.out.println("Updated!!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void deleteStatus() {
		System.out.println("Enter the status ID : ");
		int statusId = s.nextInt();

		try {
			String cmd = "DELETE FROM STATUSTABLE WHERE STATUS_ID = " + statusId;
			db.runStatement(cmd);
			System.out.println("Deleted!!");

		} catch (SQLException e) {
			System.out.println(e);
		}

		map.remove(statusId);
	}
	
	private boolean isDuplicateId(int statusId) {
		if (map.containsKey(statusId))
			return true;
		else
			return false;
	}

}
