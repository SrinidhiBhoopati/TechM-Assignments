package Sqldemo;
import java.util.Scanner;
import java.sql.*;

public class Deletingarow {

	public static void main(String[] args) throws Exception,SQLException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","tiger");
		System.out.println("enter id need to be deleted");
		int id=sc.nextInt();
		 String query = "DELETE FROM Employee WHERE id = ?";
		 PreparedStatement p = con.prepareStatement(query);
		 p.setInt(1, id);
		 int deleted=p.executeUpdate();
		 if(deleted>0)
			 System.out.println("row successfully deleted");
		 else
			 System.out.println("failed to update");
		 
sc.close();
		
        
	}

}
