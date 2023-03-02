/**
 * Java data base connector is not added to class path. 
 * the connector is can be found in the download folder
 * folder name : mysql-connector-java-8.0.29
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {

	public static void main(String[] args) throws SQLException{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");			
		}
		catch(Exception e)
		{
			System.out.println("Sothanai : " + e);
		}
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aboorvam","root","1234");
		
		Statement smt = con.createStatement();
		
		ResultSet res_set = smt.executeQuery("select * from piravi");
		// INSERT INTO MARKS(1, "Siva", "Rama")
		
		while(res_set.next())
		{
			System.out.println(res_set.getInt(1) + "\t" + res_set.getString(2) + "\t" + res_set.getString(3));
		}
		
		con.close();
	}

}
