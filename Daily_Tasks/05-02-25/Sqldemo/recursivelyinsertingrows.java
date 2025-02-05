package Sqldemo;
import java.sql.*;

public class recursivelyinsertingrows {

	public static void main(String[] args)throws SQLException,Exception {
		// TODO Auto-generated method stub
		//Task 1 : Recursively insert multiple row/s into the table.
		//Hint :: Use PreparedStatement
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","tiger");
		 String query = "INSERT INTO employee (id, name, age) VALUES (?, ?, ?)";
		 PreparedStatement p = con.prepareStatement(query);
		 p.setInt(1, 11);
		 p.setString(2, "nidhi");
		 p.setInt(3, 25);
		 p.executeUpdate();
		 System.out.println("inserted");
		 p.setInt(1, 12);
		 p.setString(2, "Akshaya");
		 p.setInt(3, 30);
		 p.executeUpdate();
		 System.out.println("inserted");
		 p.setInt(1, 13);
		 p.setString(2, "Manaswini");
		 p.setInt(3, 31);
		 p.executeUpdate();
		 System.out.println("inserted");

	}

}
