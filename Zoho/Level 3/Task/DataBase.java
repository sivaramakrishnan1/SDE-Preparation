package com.Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {

		public void print(int choice, String command) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "siva");

		Statement smt = con.createStatement();

		ResultSet res_set = smt.executeQuery(command);

		System.out.print("+----------+------------------------------+---------------+\n");
		System.out.print("|ID        | Name                         |Status         |\n");
		System.out.print("+----------+------------------------------+---------------+\n");

		while (res_set.next()) {
			System.out.format("|%10s|%30s|", res_set.getInt(1), res_set.getString(2));

			if (choice == 1) {
				switch (res_set.getInt(3)) {
				case 1: {
					System.out.print("          TO DO|\n");
					break;
				}
				case 2: {
					System.out.print("    Development|\n");
					break;
				}
				case 3: {
					System.out.print("           Done|\n");
					break;
				}
				default: {
					System.out.print("               |\n");
					break;
				}
				}
			} else {
				switch (res_set.getInt(3)) {
				case 1: {
					System.out.print("           Open|\n");
					break;
				}
				case 2: {
					System.out.print("    In Progress|\n");
					break;
				}
				case 3: {
					System.out.print("         Closed|\n");
					break;
				}
				default: {
					System.out.print("               |\n");
					break;
				}
				}
			}

			System.out.print("+----------+------------------------------+---------------+\n");

		}
		System.out.println();

		con.close();
	}
	public void runStatement(String command) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "siva");

		Statement smt = con.createStatement();

		smt.execute(command);

		con.close();
	}

	public void printCommand(String string) {
		// TODO Auto-generated method stub
		
	}
}
