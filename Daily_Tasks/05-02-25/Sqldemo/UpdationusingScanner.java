package Sqldemo;
import java.util.Scanner;
import java.sql.*;

public class UpdationusingScanner {

	public static void main(String[] args) throws Exception,SQLException {
		// TODO Auto-generated method stub
		//Update the row of a table dynamically using Scanner class.
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","tiger");
		 System.out.println("Enter id to be updated");
		 int id=sc.nextInt();
		 System.out.println("Enter new name");
		 String name=sc.next();
		 System.out.println("Enter new age");
		 int age=sc.nextInt();
		String query="UPDATE Employee SET name=?,age=? WHERE id=?";
		 PreparedStatement p = con.prepareStatement(query);
		 p.setString(1, name);
		 p.setInt(2, age);
		 p.setInt(3,id);
		 int updated=p.executeUpdate();
		 if(updated>0)
			 System.out.println("rows are successfully updated");
		 else
			 System.out.println("failed to update");
		 
sc.close();
	}

}
