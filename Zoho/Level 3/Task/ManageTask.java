package com.Task;

import java.util.Scanner;
import java.sql.SQLException;
import java.util.HashMap;

public class ManageTask {

	DataBase db = new DataBase();
	Scanner s = new Scanner(System.in);
	HashMap<Integer, String> map = new HashMap<>();

	/**
	 * Menu of manage task. Contains options for Add, update and delete task(s)
	 */
	public void manageTask() {
		boolean choice = true;

		while (choice) {
			System.out.println(
					"  1. Add new task" + "\n  2. Update task" + "\n  3. Delete task" + "\n  4. Previous option");
			System.out.println("Your choice : ");
			switch (s.nextInt()) {
			case 1: {
				addTask();
				break;
			}

			case 2: {
				updateTask();
				break;
			}

			case 3: {
				deleteTask();
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
	
	private void addTask() {
		// TODO Auto-generated method stub

		System.out.println("Enter the task ID : ");
		int taskId = s.nextInt();

		if (isDuplicateId(taskId)) {
			System.out.println("Task ID already exists, try again");
			return;
		}

		System.out.println("Enter the task name : ");
		String taskName = s.nextLine();

		System.out.println("Enter the task status : " + "\n1. To Do" + "\n2. Development" + "\n3. Done");
		int taskStatus = s.nextInt();

		if (taskStatus < 1 || taskStatus > 3) {
			System.out.println("Not an option from above. Try again. ");
			return;
		}

		try {
			String cmd = "INSERT INTO TASKTABLE (TASK_ID , TASK_NAME , TASK_STATUS ) VALUES( " + taskId + " , \"" + taskName + "\" , " + taskStatus + ")";
			db.runStatement(cmd);
			map.put(taskId, "Present");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Task : " + taskName + " added with the status : " + taskStatus);
	}

	private void updateTask() {
		System.out.println("Enter the task ID : ");
		int taskId = s.nextInt();
		
		System.out.println("1. To do \n 2. Development \n3. Done");
		
		int taskStatus = s.nextInt();

		if (taskStatus < 1 || taskStatus > 3) {
			System.out.println("Not an option from above. Try again. ");
			return;
		}

		try {
			String cmd = "UPDATE TASKTABLE SET TASK_STATUS = " + taskStatus + " WHERE TASK_ID = " + taskId;
			db.runStatement(cmd);
			System.out.println("Updated!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void deleteTask() {
		System.out.println("Enter the task ID : ");
		int taskId = s.nextInt();

		try {
			String cmd = "DELETE FROM TASKTABLE WHERE TASK_ID = " + taskId;
			db.runStatement(cmd);
			System.out.println("Deleted!!");

		} catch (SQLException e) {
			System.out.println(e);
		}

		map.remove(taskId);
	}

	private boolean isDuplicateId(int taskId) {
		if (map.containsKey(taskId))
			return true;
		else
			return false;
	}
}
